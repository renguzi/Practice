package com.atguigu.StringAndUtilClasses.String;

import org.junit.jupiter.api.Test;

/**
 * @Author:asher
 * @Date:2020/9/14 14:32
 * @Description:com.atguigu.StringAndUtilClasses.String
 * @Version:1.0
 */
public class StringToPrimeWrapper {
    @Test
    public void test() {
        //1String--->primitive type、Wrapper，调用包装类的静态方法，parseXxx(String)
        //
        String s1 = "123";
        int i = Integer.parseInt(s1);
        System.out.println(i);
        s1 = "true1";
        boolean b = Boolean.parseBoolean(s1);
        System.out.println(b);

        //primitive type/Wrapper---->String，调用String类的静态方法String.valueOf()
        String s2 = String.valueOf(b);
        System.out.println(s2);


        //String---->char[] 调用String类的toCharArray()方法；
        char[] charArray = (s2.toUpperCase()+"123").toCharArray() ;
        for (int j = 0; j < charArray.length; j++) {
            System.out.println(charArray[j]);

        }
    }
}
