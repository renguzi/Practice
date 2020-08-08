package com.atguigu.IO.File;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @Author:asher
 * @Date:2020/8/7 20:26
 * @Description:com.atguigu.IO.File
 * @Version:1.0
 */
public class FileTest {
    @Test
    public void test() {
        File file1 = new File("/Users/asher/imooc/f1.txt");
        File file2 = new File("f2.txt");

        File file3 = new File("/Users/asher/imooc", "f3.txt");
        File file4 = new File(file3,"f4.txt");
        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);
        System.out.println(file4);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(file2);
    }

    @Test
    public void test1() {
        File file = new File("/Users/asher/imooc");
        String[] files = file.list();
        for (String fileName : files) {
            System.out.println(fileName);
        }
        System.out.println("====================");
        File[] filesNames = file.listFiles();
        for (File f: filesNames ) {
            System.out.println(f);
        }
    }
}
