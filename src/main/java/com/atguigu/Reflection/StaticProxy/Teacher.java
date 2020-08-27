package com.atguigu.Reflection.StaticProxy;

/**
 * @Author:asher
 * @Date:2020/8/20 10:16
 * @Description:com.atguigu.Reflection.StaticProxy
 * @Version:1.0
 */
public class Teacher implements MyInterface {
    @Override
    public void sayHello() {
        System.out.println("Teacher say hello");
    }
}
