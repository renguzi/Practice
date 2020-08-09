package com.atguigu.IO.File;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author:asher
 * @Date:2020/8/9 09:17
 * @Description:com.atguigu.IO.File
 * @Version:1.0
 */
public class FileReaderTest {
    @Test
    public void test() {
        File file = new File("/Users/asher/imooc/t1.txt");
        FileReader fileReader = null;
        try{
            fileReader = new FileReader(file);
//            int n;
//            while ((n = fileReader.read()) != -1) {
//                System.out.print((char) n);
//            }
            char[] chars = new char[5];
//            System.out.println(new String(chars));
            int n;
            while ((n = fileReader.read(chars)) != -1) {
//                正确写法：
//                for (int i = 0; i <n; i++) {
//                    System.out.print(chars[i]);
//                }
//                错误写法：
//                for (int i = 0; i < chars.length; i++) {
//                    System.out.println(chars[i]);
//                }
//                错误写法：
//                System.out.print(new String(chars));
//                正确写法：
                System.out.print(new String(chars, 0, n));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fileReader) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
        char[] cbuff = {'a', 'b', 'c'};
//        String
        System.out.println(new java.lang.String(cbuff));
    }

    @Test
    public void copyFile() {
        File srcFile = new File("/Users/asher/imooc/t1.txt");
        File destFile = new File("/Users/asher/imooc/t2.txt");
        FileReader  fileReader = null;
        FileWriter fileWriter = null;
        try{
            fileReader = new FileReader(srcFile);
            fileWriter = new FileWriter(destFile);
            int len;
            char[] cbuf = new char[4];
            while ((len = fileReader.read(cbuf)) != -1) {
                fileWriter.write(cbuf, 0, len);
            }
//            fileWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fileReader){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (null != fileWriter) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
