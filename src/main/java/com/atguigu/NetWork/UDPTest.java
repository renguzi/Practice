package com.atguigu.NetWork;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.*;

/**
 * @Author:asher
 * @Date:2020/8/13 09:52
 * @Description:com.atguigu.NetWork
 * @Version:1.0
 */
public class UDPTest {
    @Test
    public void test() throws IOException {
        //1 搞一个UDP的socket出来，用于发送数据。
       DatagramSocket datagramSocket = new DatagramSocket();
       //2 封装一个DatagramPacket对象实例出来，它里面包含要发送的数据，长度，对方IP地址，端口号
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        String s = "我是UDP发送的数据";
        byte[] buffer = s.getBytes();

        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, inetAddress, 3456);
        //3 开始发送数据
        datagramSocket.send(datagramPacket);
        //4 关闭socket
        datagramSocket.close();

    }

    @Test
    public void server() throws IOException {
          DatagramSocket datagramSocket = new DatagramSocket(3456);

        byte[] buffer = new byte[200];

        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
        datagramSocket.receive(datagramPacket);
        System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
        datagramSocket.close();
    }
}
