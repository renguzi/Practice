package com.atguigu.CollectionsFramework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author:asher
 * @Date:2020/8/22 19:16
 * @Description:com.atguigu.CollectionsFramework
 * @Version:1.0
 */
public class ForeachTest {
    @Test
    public void test() {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(new Person("jack", 10));
        for (Object object : collection) {
            System.out.println(object);
        }
    }

    @Test
    public void test1() {
        String[] strings = new String[]{"hello", "java"};
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "Collection";
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        for (String s: strings ) {
            s = "Debugger";
        }
        for (String s: strings ) {
            System.out.println(s);
        }
        int n=10;
        System.out.println(n >> 1);
    }
}
