package com.atguigu.StringAndUtilClasses.String;

import org.junit.jupiter.api.Test;

/**
 * @Author:asher
 * @Date:2020/9/14 16:49
 * @Description:com.atguigu.StringAndUtilClasses.String
 * @Version:1.0
 */
public class StringReverse {
    @Test

    public void test() {
        String[] a = {"h", "e", "l", "l", "o","1"};
//        System.out.println(a.toString());
        for (String s: a ) {
            System.out.println(s);
        }
        for (int i = 0; i < a.length / 2; i++) {
            String temp = a[i];
            a[i] = a[a.length - i-1];
            a[a.length-i-1]=temp;
        }
        System.out.println("===============");
        for (String s : a) {
            System.out.println(s);
        }
//        System.out.println(a);
        System.out.println("reverseMethod........");
        System.out.println(reverseMethod("abchelloworld", 3, 7));

        System.out.println(getOccurs("abhelloabcdabh", "ab"));

    }

    public String reverseMethod(String s, int low, int high) {
        char[] charArray = s.toCharArray();
        for (int i = low; i <(low+high)/2 ; i++) {
            char temp = charArray[i];
            charArray[i]=charArray[high+low-i];
            charArray[high+low-i]=temp;
        }
        return new String(charArray);
    }

    public int getOccurs(String s1, String s2) {
        if (! s1.contains(s2))
            return 0;
        int p = s1.indexOf(s2);
        System.out.println("out loop P= " + p);
        int count=0;
        while (p >= 0) {
            count++;
            s1 = s1.substring(p + s2.length());
            p = s1.indexOf(s2);
            System.out.println("in loop p= " + p);
        }
        return count;
    }
}
