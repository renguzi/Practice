package com.journaldev.util;

/**
 * @Author:asher
 * @Date:2020/6/2 11:03
 * @Description:com.journaldev.util
 * @Version:1.0
 */
public class StringPool {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        String s4 = s3.intern();
        String s5 = s1.intern();
        String s6 = "Dog".intern();
        String s7 = "Dog";
        String s8 = new String("Dog").intern();

        System.out.println(s6 == s7);
        System.out.println(s8 == s6);
        System.out.println(s8 == s7);

        System.out.println("s1 == s2 ?" + (s1 == s2));
        System.out.println("s1 == s3 ?" + (s1 == s3));
        System.out.println("s3 == s4 ?" + (s3 == s4));
        System.out.println("s1 == s5 ?" + (s1 == s5));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
