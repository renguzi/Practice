package com.atguigu.IO.BIOCHAT.client;

import java.io.*;
import java.net.Socket;

/**
 * @Author:asher
 * @Date:2020/11/22 17:06
 * @Description:com.atguigu.IO.BIOCHAT.client
 * @Version:1.0
 */
public class ChatClient {
    private final String QUIT = "quit";
    private final int DEFAULT_SERVER_PORT=8888;
    private final String DEFAULT_SERVER_HOST = "127.0.0.1";

    private Socket socket;
//    向服务器发送消息
    private BufferedWriter writer;
    //    从服务器读取消息
    private BufferedReader reader;

//    发送消息
    public void send(String msg) throws IOException {
        if (!socket.isOutputShutdown()) {
            writer.write(msg+"\n");
            writer.flush();
        }
    }

//    接受消息
    public String receive() throws IOException {
        String msg = null;
        if (!socket.isInputShutdown()) {
            msg = reader.readLine();
        }
        return msg;
    }

    //    检查用户是否准备退出
    public boolean readyToQuit(String msg) {
        return QUIT.equals(msg);
    }

    public void close() {
        if (writer != null) {
            try {
                System.out.println("关闭socket");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void start() {
        try {
//        创建socket
            socket = new Socket(DEFAULT_SERVER_HOST, DEFAULT_SERVER_PORT);
//            创建IO留
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//            处理用户的输入
            Thread thread = new Thread(new UserInputHandler(this));
            thread.start();

//            读取服务器转发的消息,调用前面声明的receive方法
            String msg=null;
            while ((msg = receive()) != null) {
                System.out.println(msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient();
        chatClient.start();
    }
}
