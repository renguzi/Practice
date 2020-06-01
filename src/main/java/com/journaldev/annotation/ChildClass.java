package com.journaldev.annotation;

/**
 * @Author:asher
 * @Date:2020/6/1 10:57
 * @Description:com.journaldev.annotation
 * @Version:1.0
 */
public class ChildClass extends BaseClass{
    public void doSomething(String string) {
        System.out.println("Child impl:" + string);
    }
}
