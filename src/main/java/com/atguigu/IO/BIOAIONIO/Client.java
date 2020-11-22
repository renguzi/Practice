package com.atguigu.IO.BIOAIONIO;

import java.io.*;
import java.net.Socket;

/**
 * @Author:asher
 * @Date:2020/11/21 14:28
 * @Description:com.atguigu.IO.BIOAIONIO
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) {
        final String QUIT = "quit";
        final int SERVER_DEFAULT_PORT=8888;
        final String SERVER_NAME="127.0.0.1";
        Socket socket = null;
        BufferedWriter bufferedWriter = null;
        try {
//            1 初始化Client socket
            socket = new Socket(SERVER_NAME, SERVER_DEFAULT_PORT);
//            2 实例化client的Reader(用于从服务器读数据)和Writer(用于向服务器写数据)
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//            3 再实例化一个Reader，用于接受用户从console的输入
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
//            while (true) {
//            4 接受用户的输入
                String inputData = userInput.readLine();
//            5 将用户数据的数据写给服务器,加个\n,是因为服务器在接受数据时，readLine()方法，以换行为结束符
                bufferedWriter.write(inputData + "\n");
//            下面这一行必须要加上，确保缓冲区的数据可以发送给服务器了。
                bufferedWriter.flush();
//            6 从服务器读取发送过来的数据
                String serverFeedBack = bufferedReader.readLine();
                System.out.println(serverFeedBack);
//                if (QUIT.equals(inputData)) {
//                    System.out.println("客户端断开了");
//                    break;
//                }
//            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            这里本来是要关闭socket的，但是BufferedWriter是通过socket创建的，所以，直接关闭bufferedWriter会隐式关闭socket。
            try {
                bufferedWriter.close();
                System.out.println("关闭客户端socket");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
