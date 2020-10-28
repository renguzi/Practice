package com.atguigu.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @Author:asher
 * @Date:2020/10/23 08:21
 * @Description:com.atguigu.Reflection
 * @Version:1.0
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        ArrayList<String> l2 = new ArrayList<>();
        l1.add(1);
        l1.add("hello");
        l2.add("hello");
//        l2.add(1);
        Class c1 = l1.getClass();
        Class c2 = l2.getClass();
        System.out.println(c1 == c2);

        System.out.println("l2........." + l2);
        Method method = null;
        try {
            method = c2.getMethod("add", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            method.invoke(l2, 1);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("l2........." + l2);



    }
}
