package com.imooc.reflection;

/**
 * @Author:asher
 * @Date:2020/6/24 15:58
 * @Description:com.imooc.reflection
 * @Version:1.0
 */
public class Word implements OfficeAble{
     public String name;
     private int age;


    @Override
    public void start() {
        System.out.println("word start");
    }
}
