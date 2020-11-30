package com.atguigu.IO.NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author:asher
 * @Date:2020/11/28 17:19
 * @Description:com.atguigu.IO.NIO
 * @Version:1.0
 */
public class FileChannelTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile accessFile = new RandomAccessFile("/Users/asher/IdeaProjects/Practice/nio.txt", "rw");
        FileChannel fileChannel = accessFile.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(3);
        while (fileChannel.read(byteBuffer) != -1) {
            byteBuffer.flip();
            System.out.println("+1");
            while (byteBuffer.hasRemaining()) {
                System.out.println(((char) byteBuffer.get()));
                           }
            byteBuffer.clear();
        }
        accessFile.close();
    }
}
