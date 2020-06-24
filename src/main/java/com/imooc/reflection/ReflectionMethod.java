package com.imooc.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author:asher
 * @Date:2020/6/24 22:23
 * @Description:com.imooc.reflection
 * @Version:1.0
 */
public class ReflectionMethod {
    public static void main(String[] args) {
        A a1 = new A();
        a1.print(10, 20);
        a1.print("Hello", "java");
        Class c = a1.getClass();
        try {
//            Method method = c.getMethod("print", String.class, String.class);
            Method method = c.getMethod("print", String.class, String.class);
            Method method1 = c.getMethod("print", int.class, int.class);
            Method method2 = c.getMethod("print");
            method2.invoke(a1);
            method1.invoke(a1, 10, 20);
            method.invoke(a1, "Java", "book");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

class A{
    public void print() {
        System.out.println("HelloWorld");
    }
    public void print(int a, int b) {
        System.out.println("a+b= " + (a + b));
    }

    public void print(String s1, String s2) {
        System.out.println("s1+s2=" + s1.toLowerCase() + s2.toUpperCase());
    }
}
