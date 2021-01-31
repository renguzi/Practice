package com.atguigu.IO.AIO.tutorial;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:asher
 * @Date:2020/11/30 09:10
 * @Description:com.atguigu.IO.AIO.tutorial
 * @Version:1.0
 */
public class Server {
    private final String LOCALHOST = "localhost";
    private final int DEFAULT_PORT=8888;
    private AsynchronousServerSocketChannel serverChannel;
    private void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
//        绑定监听端口
        try {
            serverChannel = AsynchronousServerSocketChannel.open();
            serverChannel.bind(new InetSocketAddress(LOCALHOST, DEFAULT_PORT));
            System.out.println("启动服务器，监听端口：" + DEFAULT_PORT);
            while (true) {
//                因为accept方法是异步的，一旦调用就立马返回了，我们又不想让它立即返回，因为如果这个时候，没有客户端发上来的连接，就立马返回的话
//                就不对了，下次客户端再来的话，就发现服务器端已经不在了，就宕机了..,所以，我们把它放在while true循环里，让它一直跑，可是，如果一直run
//                的话，就比较消耗资源，所以在它调用之后，弄个System.in.read()这个阻塞式的调用，让它暂时停在这儿。
                serverChannel.accept(null, new AcceptHandler());
//                下述代码没有任何业务意义，只是为了阻塞式调用，避免服务器端过早返回。
                System.in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(serverChannel);
        }
    }

    private class AcceptHandler implements CompletionHandler<AsynchronousSocketChannel, Object>{
        @Override
        public void completed(AsynchronousSocketChannel result, Object attachment) {
            if (serverChannel.isOpen()) {
                serverChannel.accept(null, this);
            }
            AsynchronousSocketChannel clientChannel = result;
            if (clientChannel != null && clientChannel.isOpen()) {
                ClientHandler clientHandler = new ClientHandler(clientChannel);
                ByteBuffer buffer = ByteBuffer.allocate(1024);

                Map<String, Object> info = new HashMap<>();
                info.put("type", "read");
                info.put("buffer", buffer);

                clientChannel.read(buffer, info, clientHandler);
            }
        }

        @Override
        public void failed(Throwable exc, Object attachment) {

        }
    }

    private class ClientHandler implements CompletionHandler<Integer,Object> {

        private AsynchronousSocketChannel clientChannel;
        public ClientHandler(AsynchronousSocketChannel clientChannel) {
            this.clientChannel = clientChannel;
        }

        @Override
        public void completed(Integer result, Object attachment) {
         Map<String, Object> info = (Map<String, Object>) attachment;
            String type = (String) info.get("type");

            if ("read".equals(type)) {
                ByteBuffer buffer = (ByteBuffer) info.get("buffer");
                buffer.flip();
                info.put("type", "write");
                clientChannel.write(buffer, info, this);
                buffer.clear();
            } else if ("write".equals(type)) {
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                info.put("type", "read");
                info.put("buffer", buffer);
                clientChannel.read(buffer, info, this);
            }
        }

        @Override
        public void failed(Throwable exc, Object attachment) {
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
