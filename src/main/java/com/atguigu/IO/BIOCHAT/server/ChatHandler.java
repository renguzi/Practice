package com.atguigu.IO.BIOCHAT.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @Author:asher
 * @Date:2020/11/22 17:06
 * @Description:com.atguigu.IO.BIOCHAT.server
 * @Version:1.0
 */
public class ChatHandler implements Runnable{
//    启动的ChatServer
    private ChatServer chatServer;
//    与客户端通信的socket
    private Socket socket;

    public ChatHandler(ChatServer chatServer, Socket socket) {
        this.chatServer = chatServer;
        this.socket = socket;
    }


    @Override
    public void run() {
        try {
//            存储新上线的用户
            chatServer.addClients(socket);
//            读取用户发送的消息
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = null;
            while ((msg = bufferedReader.readLine()) != null) {
                String fwdMsg = "客户端[" + socket.getPort() + "]: " + msg + "\n";
                System.out.print(fwdMsg);
//                将消息发送给在线的其它用户
                chatServer.forwardMessage(socket,fwdMsg);
//                检查用户是否准备推出
                if (chatServer.readyToQuit(msg)) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                chatServer.removeClient(socket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
