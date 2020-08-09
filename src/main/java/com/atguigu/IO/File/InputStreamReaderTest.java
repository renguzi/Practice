package com.atguigu.IO.File;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @Author:asher
 * @Date:2020/8/9 15:19
 * @Description:com.atguigu.IO.File
 * @Version:1.0
 */
public class InputStreamReaderTest {
    @Test
    public void test() throws IOException {
        File file = new File("/Users/asher/imooc/bos.txt");
        FileInputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
        FileOutputStream outputStream = new FileOutputStream("/Users/asher/imooc/bos1.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "gbk");
//        byte[] bytes = new byte[2];
//        int len;
//        while ((len = inputStream.read(bytes)) != -1) {
//            System.out.print(new String(bytes, 0, len));
//        }
//        inputStream.close();
        char[] cbuf = new char[2];
        int len ;
        while ((len = inputStreamReader.read(cbuf)) != -1) {
//            System.out.print(new String(cbuf,0,len));
            outputStreamWriter.write(cbuf, 0, len);
        }
        outputStreamWriter.close();
        inputStreamReader.close();
    }
}
