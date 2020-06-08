package com.journaldev.util;

/**
 * @Author:asher
 * @Date:2020/6/8 11:18
 * @Description:com.journaldev.util
 * @Version:1.0
 */
public class StringSubStringExample {
    public static void main(String[] args) {
        String str = "www.journaldev.com";
        System.out.println("Last 4 char String:" + str.substring(str.length()-4,str.length()));
        System.out.println("First 4 char String:" + str.substring(0, 4));
        System.out.println("website name:" + str.substring(4, 14));
    }
}
