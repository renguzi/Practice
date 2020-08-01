package com.imooc.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:asher
 * @Date:2020/8/1 12:19
 * @Description:com.imooc.IO
 * @Version:1.0
 */
public class FileInputStreamDemo1 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int n = 0;
        byte[] bytes = new byte[10];
        int m = 0;
        bytes[0] = 'Z';
        bytes[1] = 'H';
        try {
            fileInputStream = new FileInputStream("/Users/asher/imooc/imooc1.txt");
            fileOutputStream = new FileOutputStream("/Users/asher/imooc/imooc1.out");
//            n = fileInputStream.read();
//            while (n != -1) {
//                System.out.print((char) n);
//                n = fileInputStream.read();
//            }
            m = fileInputStream.read(bytes,1,7);
            System.out.println(new String(bytes));
            fileOutputStream.write(bytes,1,5);
//            System.out.println((char) bytes);
//            while (m != -1) {
//                System.out.println( m);
//                m = fileInputStream.read(bytes);
//            }

            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
