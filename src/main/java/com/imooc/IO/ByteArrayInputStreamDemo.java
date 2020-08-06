package com.imooc.IO;

import sun.plugin2.message.transport.SerializingTransport;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * @Author:asher
 * @Date:2020/8/5 11:11
 * @Description:com.imooc.IO
 * @Version:1.0
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("/Users/asher/imooc/bos.txt");
        InputStream inputStream = null;
        byte[] bytes="show me the code".getBytes();
        inputStream = new ByteArrayInputStream(bytes);

        try {
            int n = 0;
            while ((n = inputStream.read()) != -1) {
                System.out.println((char) n);
            }
            byte[] bytes1 = new byte[3];
            n = 0;
            while ( (n = inputStream.read(bytes1, 0, 2) )!=-1)
            System.out.println(new String(bytes1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
