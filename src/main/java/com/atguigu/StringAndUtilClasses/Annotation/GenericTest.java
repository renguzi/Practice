package com.atguigu.StringAndUtilClasses.Annotation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @Author:asher
 * @Date:2020/9/18 14:47
 * @Description:com.atguigu.StringAndUtilClasses.Annotation
 * @Version:1.0
 */
public class GenericTest<@MyAnnotation  T> {
    @Test
    public void test() {
        ArrayList<@MyAnnotation String> arrayList = new ArrayList<>();
        int m = (@MyAnnotation int) 100L;

    }
}
