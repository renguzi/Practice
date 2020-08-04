package com.imooc.IO;

import java.io.File;
import java.io.IOException;

/**
 * @Author:asher
 * @Date:2020/8/3 19:11
 * @Description:com.imooc.IO
 * @Version:1.0
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("/Users/asher/imooc/i1");
        if (file.exists()) {
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
        } else {
            try {
                file.createNewFile();
                System.out.println("hhhhhhhhhhhhhhh");
                System.out.println(file.isFile());
                System.out.println(file.isDirectory());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.getParent());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file1 = new File("/Users/asher/imooc/");
        String[] strings = file1.list();
        for (String s : strings) {
            System.out.println(s);
        }
        File[] files = file1.listFiles();
        for (File f : files) {
            System.out.println(f.getAbsolutePath());
        }

        printName(file1);
    }

    static void printName(File file) {
        if (file.isDirectory()) {
            for (File f:file.listFiles() ) {
                printName(f);
            }
        }
        System.out.println(file.getAbsolutePath());

    }
}
