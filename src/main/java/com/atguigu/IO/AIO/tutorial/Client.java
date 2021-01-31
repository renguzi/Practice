package com.atguigu.IO.AIO.tutorial;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @Author:asher
 * @Date:2020/12/3 08:22
 * @Description:com.atguigu.IO.AIO.tutorial
 * @Version:1.0
 */
public class Client {
    private final String LOCAL_HOST = "localhost";
    private final int DEFAULT_PORT = 8888;
    private AsynchronousSocketChannel clientChannel;

    public void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        try {
            //创建channel
            clientChannel = AsynchronousSocketChannel.open();
//            clientChannel.connect();
            Future<Void> future = clientChannel.connect(new InetSocketAddress(LOCAL_HOST, DEFAULT_PORT));
            future.get();
//            等待用户的输入
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String input = bufferedReader.readLine();

                byte[] inputBytes = input.getBytes();
                ByteBuffer buffer = ByteBuffer.wrap(inputBytes);
                Future<Integer> writeResult = clientChannel.write(buffer);

                writeResult.get();
                buffer.flip();
                Future<Integer> readResult = clientChannel.read(buffer);

                readResult.get();
                String echo = new String(buffer.array());
                buffer.clear();

                System.out.println(echo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            close(clientChannel);
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
