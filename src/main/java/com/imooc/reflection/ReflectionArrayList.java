package com.imooc.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @Author:asher
 * @Date:2020/6/24 22:45
 * @Description:com.imooc.reflection
 * @Version:1.0
 */
public class ReflectionArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        System.out.println(list2.size());
//  集合的泛型是为了防止人们输入错误的。在编译期间有效，编译之后就失效了。
        //        list2.add(100);
        System.out.println(list1.getClass() == list2.getClass());
        System.out.println(list1.getClass().getName());
        System.out.println(list2.getClass().getName());
        Class c = list2.getClass();
        try {
            Method method = c.getMethod("add", Object.class);
            method.invoke(list2, 10);
            System.out.println(list2.size());
            System.out.println(list2.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
