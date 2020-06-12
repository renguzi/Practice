package com.journaldev.String;

/**
 * @Author:asher
 * @Date:2020/6/12 09:10
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class ByteArrayToString {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{'P', 'A', 'N', 'K', 'A', 'J'};
        byte[] byteArray1 = {80, 65, 78, 75, 65, 74};
        String str1 = new String(byteArray);
        String str2 = new String(byteArray1);
        System.out.println(str1);
        System.out.println(str2);
    }
}
