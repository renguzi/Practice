package com.imooc.IO;

import java.io.*;

/**
 * @Author:asher
 * @Date:2020/8/2 11:16
 * @Description:com.imooc.IO
 * @Version:1.0
 */
public class ByteStreamToCharStream {
    public static void main(String[] args) {
        FileInputStream fileInputStream= null;
        InputStreamReader inputStreamReader = null;
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        int n = 0;
        char[] chars = new char[4];
        try {
            fileInputStream = new FileInputStream("/Users/asher/imooc/bos.txt");
            inputStreamReader = new InputStreamReader(fileInputStream);
            fileOutputStream = new FileOutputStream("/Users/asher/imooc/byte_to_char.txt");
            outputStreamWriter = new OutputStreamWriter(fileOutputStream);
//            while ((n = inputStreamReader.read()) != -1) {
//                System.out.println((char) n);
//            }
                    System.out.println("hhhhhhhhhhh");
            while ((n = inputStreamReader.read(chars)) != -1) {
                System.out.print(new String(chars, 0, n));
                outputStreamWriter.write(chars, 0, n);
            }
            inputStreamReader.close();
            fileInputStream.close();
            outputStreamWriter.close();
            fileOutputStream.close();
            System.out.println(fileInputStream.getFD());
            System.out.println(File.separator);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
