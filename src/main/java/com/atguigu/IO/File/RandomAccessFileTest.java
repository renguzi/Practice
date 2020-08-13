package com.atguigu.IO.File;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Author:asher
 * @Date:2020/8/10 15:07
 * @Description:com.atguigu.IO.File
 * @Version:1.0
 */
public class RandomAccessFileTest {
    @Test
    public void test() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("/Users/asher/imooc/h.txt", "rw");
//        RandomAccessFile randomAccessFile1 = new RandomAccessFile("/Users/asher/imooc/h.txt", "rw");
        byte[] bytes = new byte[4];
        int len;
        while ((len = randomAccessFile.read(bytes)) != -1)
            System.out.print(new String(bytes, 0, len));
        randomAccessFile.seek(5);
        randomAccessFile.write("x123".getBytes());
        randomAccessFile.close();
    }
}
