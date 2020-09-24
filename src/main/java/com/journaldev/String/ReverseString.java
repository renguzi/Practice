package com.journaldev.String;

/**
 * @Author:asher
 * @Date:2020/9/24 11:04
 * @Description:com.journaldev.String
 * @Version:1.0
 */
public class ReverseString {
    public static void main(String[] args) {
        String s = "HelloWorld.";
        System.out.println(reverseString(s));
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder.reverse());
        checkPalindromeString(s);
        checkPalindromeString("madam");
    }

    public static void checkPalindromeString(String input) {
        boolean flag = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        System.out.println("input string is palindrome ? " + flag);
    }

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char c = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = c;
        }
        return new String(chars);
    }
}
