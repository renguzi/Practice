package com.imooc.reflection;

/**
 * @Author:asher
 * @Date:2020/6/24 15:45
 * @Description:com.imooc.reflection
 * @Version:1.0
 */
public class ReflectionDemo2 {
    public static void main(String[] args) {
        Class c1 = int.class;
        Class c2 = String.class;
        Class c3 = Integer.class;
        Class c4 = void.class;
        System.out.println(c1);
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());
        System.out.println(c3.getName());
    }
}
