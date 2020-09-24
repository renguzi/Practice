package com.journaldev.String;

/**
 * @Author:asher
 * @Date:2020/9/24 15:07
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class RemoveCharFromString {
    public static void main(String[] args) {
        String s = "HelloWorld.";
        System.out.println(removeChar(s, 'o'));

    }

    public static String removeChar(String s, char c) {
        return s.replaceAll(String.valueOf(c), "");
    }
}
