package com.atguigu.NetWork;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author:asher
 * @Date:2020/8/10 20:22
 * @Description:com.atguigu.NetWork
 * @Version:1.0
 */
public class TcpTest {
    @Test
    public void client() {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
//            InetAddress localAddress = InetAddress.getLocalHost();
//            socket = new Socket(serverAddress, 2356, localAddress, 2357);
            socket = new Socket(serverAddress, 2356);
            outputStream = socket.getOutputStream();
            for (int i = 0; i < 10; i++) {
            outputStream.write("Hello,我是客户端".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    @Test
    public void server() {
        ServerSocket serverSocket =  null;
        Socket socket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
                serverSocket = new ServerSocket(2356);
//            while (true) {
                socket = serverSocket.accept();
                socket.setKeepAlive(true);
            System.out.println(socket.getKeepAlive());
            inputStream = socket.getInputStream();
//            byte[] buffers = new byte[20];
//            int len;
//            while ((len = inputStream.read(buffers)) != -1) {
//                System.out.println(new String(buffers, 0, len));
//            }
                byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] buffers = new byte[5];
                int len;
                while ((len = inputStream.read(buffers)) != -1) {
                    byteArrayOutputStream.write(buffers, 0, len);
                }
                System.out.println(byteArrayOutputStream.toString());
//                socket.getInetAddress()+
//                        socket.get
//            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    @Test
    public void test2() throws IOException {
        byte[] bytes = new byte[4];
        bytes[0]='a';
        bytes[1] = 'b';
        byte[] to = new byte[5];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("hei12llo".getBytes());

        int len;
        while ((len = byteArrayInputStream.read(to)) != -1) {
            System.out.println(to);
        }
        System.out.println(" 99999999999");
        System.out.println(new String(to));

    }
}
