package com.imooc.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author:asher
 * @Date:2020/8/4 16:14
 * @Description:com.imooc.IO
 * @Version:1.0
 */
public class FileDemo1 {
    public static void main(String[] args) {
//        1确定数据源
        File file = new File("/Users/asher/imooc/bos.txt");
//        2选择流
        try {
            FileInputStream inputStream = new FileInputStream(file);

//            3操作
            int d1 = inputStream.read();
            int d2 = inputStream.read();
            System.out.println((char)d1);
            System.out.println((char)d2);
//            4释放资源
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
