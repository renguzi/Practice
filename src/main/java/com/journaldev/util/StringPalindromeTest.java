package com.journaldev.util;

/**
 * @Author:asher
 * @Date:2020/6/8 15:47
 * @Description:com.journaldev.util
 * @Version:1.0
 */
public class StringPalindromeTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "madam";
        String s3 = "123a321";
        System.out.println("s1 Palindrome ?" + Palindrome(s1));
        System.out.println("s2 Palindrome ?" + Palindrome(s2));
        System.out.println("s3 Palindrome ?" + Palindrome(s3));
    }

    public static boolean Palindrome(String string) {
        if (string == null) {
            return false;
        }
        if (string.length() <= 1) {
            return true;
        }
        String first = string.substring(0, 1);
        String last = string.substring(string.length() - 1);
        if (!first.equals(last)) {
            return false;
        } else return Palindrome(string.substring(1, string.length() - 1));
    }
}
