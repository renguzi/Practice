package com.atguigu.Reflection.StaticProxy;

import org.junit.jupiter.api.Test;

/**
 * @Author:asher
 * @Date:2020/8/20 10:25
 * @Description:com.atguigu.Reflection.StaticProxy
 * @Version:1.0
 */
public class StaticProxyTest {
    @Test
    public void test() {
        MyInterface teacher = new Teacher();
        MyInterface student = new Student(teacher);

        student.sayHello();
    }
}
