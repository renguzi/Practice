package com.atguigu.Reflection.StaticProxy;

/**
 * @Author:asher
 * @Date:2020/8/20 10:23
 * @Description:com.atguigu.Reflection.StaticProxy
 * @Version:1.0
 */
public class Student implements MyInterface {

    private MyInterface t;

    public Student(MyInterface t) {
        this.t = t;
    }

    @Override
    public void sayHello() {
        System.out.println("代理类做准备工作");
        t.sayHello();
//        System.out.println("Student say hello");
        System.out.println("代理类收尾工作");
    }
}
