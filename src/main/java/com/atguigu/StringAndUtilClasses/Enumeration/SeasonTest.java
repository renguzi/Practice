package com.atguigu.StringAndUtilClasses.Enumeration;

import org.junit.jupiter.api.Test;

/**
 * @Author:asher
 * @Date:2020/9/17 17:22
 * @Description:com.atguigu.StringAndUtilClasses.Enumeration
 * @Version:1.0
 */
public class SeasonTest {
    @Test
    public void test() {
        Season[] values = Season.values();
        System.out.println(values.length);
        for (Season s: values ) {
            System.out.println(s);
        }
//        System.out.println(Season.valueOf("Hello"));

        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }
    }
}
