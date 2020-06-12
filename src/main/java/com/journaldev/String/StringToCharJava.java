package com.journaldev.String;

import java.util.Arrays;

/**
 * @Author:asher
 * @Date:2020/6/12 08:27
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class StringToCharJava {
    public static void main(String[] args) {
        String string = "journaldev";
        char[] chars = string.toCharArray();

        char c = string.charAt(0);
        char[] chars1 = new char[7];
        string.getChars(0, 6, chars1, 0);
        System.out.println(Arrays.toString(chars));
        System.out.println(c);
        System.out.println(Arrays.toString(chars1));
        System.out.println(chars1.length);

    }
}
