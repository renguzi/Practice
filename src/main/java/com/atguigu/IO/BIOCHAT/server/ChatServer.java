package com.atguigu.IO.BIOCHAT.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:asher
 * @Date:2020/11/22 16:59
 * @Description:com.atguigu.IO.BIOCHAT
 * @Version:1.0
 */
public class ChatServer {
    private int DEFAULT_PORT=8888;
    private final String QUIT = "quit";
    private ExecutorService executorService;
    private ServerSocket serverSocket;  //接收客户端发起连接的请求
    //记录已连接的客户端会话，key是客户端的port，value是要发送出去的消息
    private Map<Integer, Writer> connectedClients;

    public ChatServer() {
        executorService = Executors.newCachedThreadPool();
        connectedClients = new HashMap<>();
    }

//    入参socket是表示和客户端建立连接的socket,将新建立的连接放到“哪些是活跃的客户端会话中”
    public synchronized void addClients(Socket socket) throws IOException {
        if (socket != null) {
            int port = socket.getPort();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            connectedClients.put(port, bufferedWriter);
            System.out.println("客户端[" + port + "]已连接");
        }
    }


//    入参socket是表示和客户端建立连接的socket，从“已建立的活跃的客户端会话中移除”
    public synchronized void removeClient(Socket socket) throws IOException {
        if (socket != null) {
            int port = socket.getPort();
            if (connectedClients.containsKey(port)) {
                connectedClients.get(port).close();
            }
            connectedClients.remove(socket.getPort());
            System.out.println("客户端[" + port + "]已断开");
        }
    }


    //    转发消息，即将某个客户端发来的会话，转发给其它的所有的客户端，
    //遍历，connectedClients,当不是我自己这个socket的话，就把消息转发出去
    public synchronized void forwardMessage(Socket socket, String fwdMsg) throws IOException {
        for (Integer id:connectedClients.keySet() ) {
            if (!id.equals(socket.getPort())) {
                Writer writer = connectedClients.get(id);
                writer.write(fwdMsg);
                writer.flush();
            }
        }
    }

    public synchronized void close() {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    检查用户是否准备退出？
    public boolean readyToQuit(String msg) {
        return QUIT.equals(msg);
    }
    public void start() {
        try {
//        绑定监听端口
            serverSocket = new ServerSocket(DEFAULT_PORT);
            System.out.println("服务端启动在：[" + serverSocket.getLocalPort() + "]...");
            while (true) {
//                等待客户端连接
                Socket socket = serverSocket.accept();
//                创建客户端ChatHandler线程,并启动它
//                Thread thread=new Thread(new ChatHandler(this, socket));
//                thread.start();
//                把上面2行代码改成线程池的方式
                executorService.execute(new ChatHandler(this, socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

//    因为将来是要启动ChatServer的，所以u，要有个main方法，用于启动它k
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        chatServer.start();
    }
}
