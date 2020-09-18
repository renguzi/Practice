package com.atguigu.StringAndUtilClasses.String;

import org.junit.jupiter.api.Test;

/**
 * @Author:asher
 * @Date:2020/9/14 16:11
 * @Description:com.atguigu.StringAndUtilClasses.String
 * @Version:1.0
 */
public class AnalogTrim {
    @Test
    public void test() {
        String s1 = " hel lo ";
        System.out.println("s1 length:" + s1.length());
        System.out.println("Trim s1 head length:");
        System.out.println(myTrim(s1).length());

    }

    public String myTrim(String s) {
        String s1="";
        if (s.length() <= 1) {
            return s;
        }
        String[] split = s.split("\\^ ");
        for (int i = 0; i < split.length; i++) {
            s1 += split[i];
        }
//       return split.toString();
        return s1;
    }
}
