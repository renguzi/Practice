package com.atguigu.IO.NIOCHAT;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.util.Set;

/**
 * @Author:asher
 * @Date:2020/11/27 21:57
 * @Description:com.atguigu.IO.NIOCHAT
 * @Version:1.0
 */
public class ChatServer {
    private static int DEFAULT_PORT=8888;
    private static String QUIT = "quit";
    private static final int BUFFER = 1024;

    private ServerSocketChannel server;
    private Selector selector;
    private ByteBuffer rBuffer = ByteBuffer.allocate(BUFFER);
    private ByteBuffer wBuffer = ByteBuffer.allocate(BUFFER);
    private Charset charset = Charset.forName("UTF-8");
    private int port;

    public ChatServer() {
        this(DEFAULT_PORT);
    }

    public ChatServer(int port) {
        this.port = port;
    }

    private void start() {
        try {
//            初始化ServerSocketChannel;
            server=ServerSocketChannel.open();
//            设置nio模式的ServerSocketChannel为非阻塞式
            server.configureBlocking(false);
//            绑定端口
            server.bind(new InetSocketAddress(port));
            selector = Selector.open();
            server.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("服务器启动在端口:" + port);

            while (true) {
                selector.select();
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                for (SelectionKey keys : selectionKeys) {
                    handles(keys);
                }
                selectionKeys.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(selector);
        }
    }

    private void handles(SelectionKey key) throws IOException {
//        ACCEPT事件---和客户端建立了连接
        if (key.isAcceptable()) {
            ServerSocketChannel server = (ServerSocketChannel) key.channel();
            SocketChannel client = server.accept();
//            设置为非阻塞模式
            client.configureBlocking(false);
            client.register(selector, SelectionKey.OP_READ);
            System.out.println(getClientName(client)+ "已连接");
        }
        //READ事件，客户端发送了消息
        else if (key.isReadable()) {
            SocketChannel client = (SocketChannel) key.channel();
            String fwdMsg = receive(client);
            if (fwdMsg.isEmpty()) {
                //客户端异常
//                key.channel();    该死的新手，粗心大意，！！！！！
                key.cancel();
                selector.wakeup();
            } else {
                forwardMsg(client, fwdMsg);
                //检查用户是否退出
                if (readToQuit(fwdMsg)) {
//                    key.channel();    该死的新手，粗心大意！！！！！
                    key.cancel();
                    selector.wakeup();
                    System.out.println(getClientName(client) + "已断开");
                }
            }
        }
    }

    private void forwardMsg(SocketChannel client, String fwdMsg) throws IOException {
        for (SelectionKey key : selector.keys()) {
            Channel connectedChannel = key.channel();
            if (connectedChannel instanceof ServerSocketChannel) {
                System.out.println(getClientName(client) + fwdMsg);
                continue;
            }
            if (key.isValid() && !client.equals(connectedChannel)) {
                wBuffer.clear();
                wBuffer.put(charset.encode(getClientName(client) +":"+ fwdMsg));
                wBuffer.flip();
                while (wBuffer.hasRemaining()) {
                    ((SocketChannel) connectedChannel).write(wBuffer);
                }
            }
        }
    }

    private String receive(SocketChannel client) throws IOException {
        rBuffer.clear();
        while (client.read(rBuffer) > 0) ;
            rBuffer.flip();
        return String.valueOf(charset.decode(rBuffer));

    }

    private String getClientName(SocketChannel socketChannel) {
        return "客户端"+socketChannel.socket().getPort()+"]";
    }

    private boolean readToQuit(String msg) {
        return QUIT.equals(msg);
    }

    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer(7777);
        chatServer.start();
    }

}
