package com.atguigu.Reflection.GetClassStructure;

import java.time.Period;

/**
 * @Author:asher
 * @Date:2020/8/15 19:07
 * @Description:com.atguigu.Reflection.GetClassStructure
 * @Version:1.0
 */
@MyAnnotation("修饰类")
public class Person extends Creature<String> implements Comparable<String>,MyInterface{
    private String name;
    int age;
    public int id;

    public Person() {
    }

    @MyAnnotation("修饰构造方法")
    private Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String display(String interests) {
        return interests;
    }
    @MyAnnotation("修饰方法")
    private String show(String nation) {
        System.out.println("我的国籍是：" + nation);
        return nation;
    }
    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void info() {
        System.out.println("我是一个人");
    }
}
