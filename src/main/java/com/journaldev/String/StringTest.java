package com.journaldev.String;

/**
 * @Author:asher
 * @Date:2020/9/18 16:25
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("abc");
        char[] c1 = {'a', 'b', 'c'};
        String s2 = new String(c1);
        System.out.println(s1 == s2);

        String s3 = s1.intern();

        System.out.println(s1 == s3);
        String s4 = "abc";
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
    }
}
