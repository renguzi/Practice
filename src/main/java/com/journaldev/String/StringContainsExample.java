package com.journaldev.String;

/**
 * @Author:asher
 * @Date:2020/9/18 16:52
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class StringContainsExample {
    public static void main(String[] args) {
        String s = "Hello World";
        String s1=s;
        System.out.println(s.contains("W"));
        System.out.println(s.contains("X"));
        System.out.println(s1 == s);
        String s2 = s.replace("H", "h");
        System.out.println(s1 == s);
        System.out.println(s1 == s2);
    }
}
