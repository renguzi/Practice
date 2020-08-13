package com.atguigu.NetWork;

/**
 * @Author:asher
 * @Date:2020/8/12 17:53
 * @Description:com.atguigu.NetWork
 * @Version:1.0
 */

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户方发送文件给服务端，服务端接收之后，返回一条信息给客户端，客户端把接收到的消息，打印在控制台显示。
 */
public class TcpTest3 {
    @Test
    public void client() {
        Socket socket = null;
        OutputStream outputStream = null;
        File file = null;
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            //1创建1个Socket，用于和服务器通信
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 3345);
            //2创建1个输出流对象，OutputStream
            outputStream = socket.getOutputStream();

            //3创建1个文件输入流，再包装一个缓冲流，用于读取本地的文件
            file = new File("/Users/asher/imooc/qrcode.jpg");
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] buffer = new byte[20];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            socket.shutdownOutput();

            InputStream inputStream = socket.getInputStream();
            byte[] recBuffer = new byte[30];
            int n;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while ((n = inputStream.read(recBuffer)) != -1) {
                byteArrayOutputStream.write(recBuffer, 0, n);
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedInputStream!=null) {
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(3345);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        File file = new File("/Users/asher/imooc/qrfromclient.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        byte[] buffer = new byte[20];
        int len;
        while ((len = inputStream.read(buffer)) != -1) {
            bufferedOutputStream.write(buffer, 0, len);
        }
        System.out.println("文件已经收到");
        //搞一个OutputStream类的对象出来，用于给客户端返回消息。
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("图片已经收到啦，，，，，，，".getBytes());
        outputStream.close();

        bufferedOutputStream.close();
        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }

}
