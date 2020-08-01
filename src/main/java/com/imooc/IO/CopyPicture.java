package com.imooc.IO;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author:asher
 * @Date:2020/8/1 18:14
 * @Description:com.imooc.IO
 * @Version:1.0
 */
public class CopyPicture {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int n = 0;
        byte[] bytes = new byte[102400];
        try {
            fileInputStream = new FileInputStream("/Users/asher/imooc/qrcode.jpg");
            fileOutputStream = new FileOutputStream("/Users/asher/imooc/qrcode_cp.jpg");
//            n = fileInputStream.read();
            while ((n = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, n);
//                n = fileInputStream.read();
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
