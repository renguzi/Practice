package com.imooc.reflection;

import java.lang.reflect.Constructor;

/**
 * @Author:asher
 * @Date:2020/6/24 09:02
 * @Description:com.imooc.reflection
 * @Version:1.0
 */
public class ReflectionDemo1 {
    public static void main(String[] args) {
        Foo foo1 = new Foo();
        Class c1 = foo1.getClass();

        Class c2 = Foo.class;

        System.out.println(c1 == c2);

        Class c3 = null;
        try {
            c3 = Class.forName("com.imooc.reflection.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(c2 == c3);

        try {
//            Foo foo = Foo.class.newInstance();
            Foo foo = foo1.getClass().newInstance();
            foo.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
class Foo {
    void print() {
        System.out.println("Foo类的方法");
    }

}
