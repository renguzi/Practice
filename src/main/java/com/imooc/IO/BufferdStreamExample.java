package com.imooc.IO;

import java.io.*;

/**
 * @Author:asher
 * @Date:2020/8/1 18:54
 * @Description:com.imooc.IO
 * @Version:1.0
 */
public class BufferdStreamExample {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileOutputStream = new FileOutputStream("/Users/asher/imooc/bos.txt");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(100);
            bufferedOutputStream.write('Z');
            bufferedOutputStream.flush();
            fileInputStream = new FileInputStream("/Users/asher/imooc/bos.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            System.out.println(bufferedInputStream.read());
            System.out.println((char)bufferedInputStream.read());
            bufferedInputStream.close();
            fileInputStream.close();
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
