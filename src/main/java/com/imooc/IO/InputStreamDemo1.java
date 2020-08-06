package com.imooc.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * @Author:asher
 * @Date:2020/8/4 16:50
 * @Description:com.imooc.IO
 * @Version:1.0
 */

public class InputStreamDemo1 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        int n=-1;
        try {
            fileInputStream = new FileInputStream("/Users/asher/imooc/bos.txt");
            byte[] car = new byte[300];
            while ((n = fileInputStream.read(car,0,3))!=-1) {
                String str = new String(car, 0,car.length);
                System.out.println(str);
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
