package com.journaldev.String;

/**
 * @Author:asher
 * @Date:2020/9/21 16:11
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class StringPalindromeTest {
    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "1abcd";
        String s3 = "ABCBA";
        String s4 = "a";
        String s5 = null;
        System.out.println(palindromeCheck(s1));
        System.out.println(palindromeCheck(s2));
        System.out.println(palindromeCheck(s3));
        System.out.println(palindromeCheck(s4));
        System.out.println(palindromeCheck(s5));
    }


    public static boolean palindromeCheck(String arr) {
        if (arr == null) {
            return false;
        }
        if (arr.length() == 1) {
            return true;
        }
        String first = arr.substring(0, 1);
        String last = arr.substring(arr.length() - 1, arr.length());
        if (!first.equals(last)) {
            return false;
        } else {
            return palindromeCheck(arr.substring(1, arr.length() - 1));
        }
    }
}
