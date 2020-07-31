package com.journaldev.design.flyweight;

/**
 * @Author:asher
 * @Date:2020/7/8 10:30
 * @Description:com.journaldev.design.flyweight
 * @Version:1.0
 */
public class TestFly{
    public static void main(String[] args) {
        Integer x = Integer.valueOf(129);
        Integer y = Integer.valueOf(129);
        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}
