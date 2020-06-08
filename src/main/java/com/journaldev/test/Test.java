package com.journaldev.test;

/**
 * @Author:asher
 * @Date:2020/6/8 10:30
 * @Description:com.journaldev.test
 * @Version:1.0
 */
public class Test {
    public static void main(String[] args) {
        Balloon red = new Balloon("Red");
        Balloon blue = new Balloon("Blue");
        swap(red, blue);
        System.out.println("red color=" + red.getColor());
        System.out.println("blue color=" + blue.getColor());
        foo(blue);
        System.out.println("blue color=" + blue.getColor());
    }

    public static void foo(Balloon balloon) {
        balloon.setColor("Red");
        balloon = new Balloon("Green");
        balloon.setColor("Blue");
    }

    public static void swap(Object o1, Object o2) {
        Object temp=o1;
        o1 = o2;
        o2 = temp;
    }
}
