package com.journaldev.String;

/**
 * @Author:asher
 * @Date:2020/9/20 22:35
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class StringIntern {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        String s3 = "abc";
        System.out.println("s1==s2 ? " + (s1 == s2));
        System.out.println("s2==s3 ? " + (s2 == s3));

        s1 = s1.intern();
        System.out.println("s1==s2 again ? " + (s1 == s2));
    }
}
