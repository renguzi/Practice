package com.journaldev.String;

/**
 * @Author:asher
 * @Date:2020/9/18 16:44
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class StringSplit {
    public static void main(String[] args) {
        String s1 = "a/b/c/d";
        String[] strings = s1.split("/");
        for (String s: strings ) {
            System.out.println(s);
        }

        String[] strings1 = s1.split("/", 5);
        for (String s: strings1 ) {
            System.out.println(s);
        }
    }
}
