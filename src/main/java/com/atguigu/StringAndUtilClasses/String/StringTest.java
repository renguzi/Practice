package com.atguigu.StringAndUtilClasses.String;

import org.junit.jupiter.api.Test;

import java.time.Period;

/**
 * @Author:asher
 * @Date:2020/9/13 19:35
 * @Description:com.atguigu.StringAndUtilClasses.String
 * @Version:1.0
 */
public class StringTest {
    @Test
    public void test1() {
        //s1,s2位于Heap区中的String pool,字符串常量池中。
        //String pool中，不会存在内容相同的变量。
        String s1 = "abc";
        String s2 = "abc";
        //s3，s4位于Heap内存中，且他们的地址值不相同。
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2);//True
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s3 == s4);

        System.out.println("--------------------");
        Person p1 = new Person(new String("Tom"), 12);
        Person p2 = new Person(new String("Tom"), 12);
        System.out.println(p1 == p2);//false

        System.out.println(p1.getName() == p2.getName());


    }

}
