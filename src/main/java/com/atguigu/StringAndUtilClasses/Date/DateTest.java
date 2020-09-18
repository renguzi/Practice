package com.atguigu.StringAndUtilClasses.Date;

import org.junit.jupiter.api.Test;

import java.util.*;

import static java.lang.Thread.sleep;

/**
 * @Author:asher
 * @Date:2020/9/15 17:01
 * @Description:com.atguigu.StringAndUtilClasses.Date
 * @Version:1.0
 */
public class DateTest {
    @Test
    public void test() throws InterruptedException {
        Date date1 = new Date();
        System.out.println(date1.getTime());
        System.out.println(date1.toString());
        sleep(100);
        Date date = new Date(date1.getTime());
        System.out.println(date);
        System.out.println(date.getTime());


    }
}
