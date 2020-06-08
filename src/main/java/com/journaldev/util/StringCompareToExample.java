package com.journaldev.util;

/**
 * @Author:asher
 * @Date:2020/6/8 16:14
 * @Description:com.journaldev.util
 * @Version:1.0
 */
public class StringCompareToExample {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(str.compareTo("DEF"));
        System.out.println(str.compareToIgnoreCase("abc"));
    }
}
