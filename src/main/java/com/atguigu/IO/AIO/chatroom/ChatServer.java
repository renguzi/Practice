package com.atguigu.IO.AIO.chatroom;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousChannelGroup;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:asher
 * @Date:2020/12/3 10:51
 * @Description:com.atguigu.IO.AIO.chatroom
 * @Version:1.0
 */
public class ChatServer {
    private static final String LOCALHOST = "localhost";
    private static final int DEFAULT_PORT = 8888;
    private static final String QUIT = "quit";
    private static final int BUFFER = 1024;
    private static final int THREADPOOL_SIZE = 8;

    private AsynchronousChannelGroup channelGroup;
    private AsynchronousServerSocketChannel serverChannel;
    private Charset charset = Charset.forName("UTF-8");
    private  int port;
    private List<ClientHandler> connectedClients;

    public ChatServer() {
        this(DEFAULT_PORT);
    }

    public ChatServer(int port) {
        this.port = port;
        this.connectedClients=new ArrayList<>();
    }

    private void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean readyToQuit(String msg) {
        return QUIT.equals(msg);
    }

    private void start() {
//         先创建AsynchronousServerSocketChannel，同时要将它放入一个AsynchronousSocketGroup中，所以，要先创建一个AsynchronousSocketGroup，
//        而创建AsynchronousSocketGroup之前，就得要先创建一个线程池。
//        通过Executor(接口)，ExecutorService(实现类),Executors(工具类)来创建线程池：
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(THREADPOOL_SIZE);
            channelGroup = AsynchronousChannelGroup.withThreadPool(executorService);
            serverChannel = AsynchronousServerSocketChannel.open(channelGroup);
            while (true) {
                serverChannel.accept(null, new AccpetHandler());
                System.in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            close(serverChannel);
        }
    }


    private class AccpetHandler implements CompletionHandler<AsynchronousSocketChannel,Object> {
        @Override
        public void completed(AsynchronousSocketChannel clientChannel, Object attachment) {
            if (serverChannel.isOpen()) {
                serverChannel.accept(null, this);
            }
            if (clientChannel != null && clientChannel.isOpen()) {
                ClientHandler handler = new ClientHandler(clientChannel);
                ByteBuffer buffer = ByteBuffer.allocate(BUFFER);
//                这里参数，第1个buffer，是告诉系统，把clientChannel里的读取的数据，写入我这个buffer中
//                第2个buffer，是作为attachment的对象，传给handler的回调函数里，使得可以对attachment里的内容进行操作
//                TODO 将新用户添加到在线用户列表
//                addClient(handler);
                clientChannel.read(buffer, buffer, handler);
            }

        }
        @Override
        public void failed(Throwable exc, Object attachment) {
            System.out.println("连接失败：" + exc);
        }
    }

    private class ClientHandler implements CompletionHandler<Integer,Object> {
        public ClientHandler(AsynchronousSocketChannel clientChannel) {
            this.clientChannel = clientChannel;
        }

        private AsynchronousSocketChannel clientChannel;

        @Override
        public void completed(Integer result, Object attachment) {
            ByteBuffer buffer = (ByteBuffer) attachment;
//            此种情况下，只有buffer的读和写两种操作，而写的时候，buffer肯定是NULL的，所以，判断其不为NULL，那么就是读操作了。
            if (buffer != null) {
//                当我们的读操作的返回值不为整数，<=0的话，则意味着这个客户端已经异常、或者是掉线了，我们就不再需要给它转发消息了，直接忽视
//                并将它从在线客户列表中移除
                if (result < 0) {
//                    TODO 将客户端移除在线客户列表

                } else {
                    buffer.flip();
//                    String fwdMsg = receive(buffer);
//                    System.out.println(getClientName(clientChannel) + " :" + fwdMsg);
//                    forwardMessage(clientChannel, fwdMsg);
                    buffer.clear();

                }
            }
        }

        @Override
        public void failed(Throwable exc, Object attachment) {

        }
    }
}
