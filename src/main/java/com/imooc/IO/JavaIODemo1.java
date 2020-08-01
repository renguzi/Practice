package com.imooc.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:asher
 * @Date:2020/7/31 20:19
 * @Description:com.imooc.IO
 * @Version:1.0
 */
public class JavaIODemo1 {
    public static void main(String[] args) {
//        File file1 = new File("/Users/asher/imooc/imooc2.txt");
//        File file1 = new File("/Users/asher", "/imooc/imooc1.txt");
        File file = new File("/Users/asher");
        File file1 = new File(file, "/imooc/imooc1.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());

        File file2 = new File("/Users/asher/imooc/tz");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        File file3 = new File("/Users/asher/imooc/dir/dir1");
        if (!file3.exists()) {
            file3.mkdirs();
        }
        System.out.println(file3.exists());
    }
}
