package com.atguigu.NetWork;

import org.junit.jupiter.api.Test;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author:asher
 * @Date:2020/8/10 18:12
 * @Description:com.atguigu.NetWork
 * @Version:1.0
 */
public class InetAddressTest {
    @Test
    public void test1() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        System.out.println(inetAddress);
        Inet4Address inet4Address = (Inet4Address) inetAddress.getByName("www.google.com");
        System.out.println(inet4Address);
        InetAddress byName = Inet6Address.getByName("www.google.com");
        System.out.println(byName);

        System.out.println(InetAddress.getLocalHost());
        System.out.println(InetAddress.getLoopbackAddress());
    }

}
