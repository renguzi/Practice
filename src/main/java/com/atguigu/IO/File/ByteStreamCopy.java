package com.atguigu.IO.File;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author:asher
 * @Date:2020/8/9 11:54
 * @Description:com.atguigu.IO.File
 * @Version:1.0
 */
public class ByteStreamCopy {
    @Test

    public void test1() {
        long start = System.currentTimeMillis();
        String From = "/Users/asher/imooc/docker_practice.pdf";
        String To = "/Users/asher/imooc/docker_practicecp.pdf";
//        copyWithFileInputStream(From, To); //132ms
        copyWithBufferedStream(From,To);
        long end = System.currentTimeMillis();
        System.out.println("copy during: " + (end - start) + " mils");
    }

    public void copyWithFileInputStream(String srcPath, String destPath) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            inputStream = new FileInputStream(srcFile);
            outputStream = new FileOutputStream(destFile);
            int n;
            byte[] bytes = new byte[1024];
            while ((n = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != outputStream) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void copyWithBufferedStream(String srcPath, String destPath) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            FileOutputStream fileOutputStream = new FileOutputStream(destFile);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            int n;
            byte[] byteBuffer = new byte[1024];
            while ((n = bufferedInputStream.read(byteBuffer)) != -1) {
                bufferedOutputStream.write(byteBuffer, 0, n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != bufferedInputStream) {
                    bufferedInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (null != bufferedOutputStream) {
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
