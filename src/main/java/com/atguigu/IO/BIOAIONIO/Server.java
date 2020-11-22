package com.atguigu.IO.BIOAIONIO;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author:asher
 * @Date:2020/11/21 14:28
 * @Description:com.atguigu.IO.BIOAIONIO
 * @Version:1.0
 */
public class Server {
    public static void main(String[] args) {
        final String QUIT = "quit";
        ServerSocket serverSocket = null;
        final int DEFAULT_PORT = 8888;

        try {
            //1 绑定端口
            serverSocket = new ServerSocket(DEFAULT_PORT);
            System.out.println("启动服务器，监听端口在：" + serverSocket.getLocalPort());
//            2 调用accept方法，等待客户端连接
//            说明：a 该方法调用，相当于是阻塞模式，即，如果没有等待客户端连接，就一直等，啥也不干
//            b 如果有客户端连接，则该方法返回值类型是一个Socket，即，表示客户端连接的端点
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("客户端："+socket.getPort()+"已连接");
//                这里用了2层装饰器模式，BufferedReader里面套了一个InputStreamReader，而InputStreamReader里又套了一个InputStream；
//                同时，要知道InputStreamReader是一个字节--->字符转换流
//                BufferedReader和InputStreamReader都是输入字符流的“高级类“,他们都需要套一个字符输入流的对象。
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//     下面的是判断客户端是否输入quit退出前的代码
////                读取客户端发起的消息
//                String msg = bufferedReader.readLine();
////                为什么要判空呢？因为有可能，客户端在发生的过程中，出现未知错误或网络异常，导致，读取到的信息为NULL。
//                if (msg != null) {
//                    System.out.println("客户端" + socket.getPort() + "发送的消息为：" + msg);
////                    服务端发送消息回去给客户端
//                    bufferedWriter.write("服务器发送回去的的消息为：" + msg + "\n");
////                    防止消息有缓存，调用flush()方法，把所有消息都写出去
//                    bufferedWriter.flush();
//                }
//                判断客户端是否输入了quit退出？
                String msg = null;
                while ((msg = bufferedReader.readLine()) != null) {
                    System.out.println("客户端" + socket.getPort() + "发过来的消息为：" + msg);
//                    服务器回写消息给客户端
                    bufferedWriter.write("服务器：" + msg);
                    bufferedWriter.flush();
                    if (QUIT.equals(msg)) {
                        System.out.println("客户端：" + socket.getPort() + "断开了");
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            最后关闭ServerSocket
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                    System.out.println("关闭ServerSocket。");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
