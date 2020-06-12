package com.journaldev.String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Author:asher
 * @Date:2020/6/12 08:55
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class StringToByteArray {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String string = "journaldev";
        byte[] bytes = string.getBytes("UTF-8");
        System.out.println("String to byte array:" + Arrays.toString(bytes));
    }
}
