package com.imooc.IO;

import java.io.UnsupportedEncodingException;

/**
 * @Author:asher
 * @Date:2020/8/4 09:52
 * @Description:com.imooc.IO
 * @Version:1.0
 */
public class StringToByteArray {
    public static void main(String[] args) {
        String s = "性命生命使命";
        byte[] bytes= new byte[0];
        try {
            bytes = s.getBytes("gbk");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(bytes.length);

        String s1 = null;
            s1 = new String(bytes);
        System.out.println(s1);
        System.out.println(s1.length());
    }
}
