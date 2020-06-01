package com.journaldev.design;

/**
 * @Author:asher
 * @Date:2020/6/1 15:31
 * @Description:com.journaldev.design
 * @Version:1.0
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Circle(10);
        shape.draw();
        System.out.println("Area= " + shape.getArea());

        shape = new Rectangle(10, 4);
        shape.draw();
        System.out.println("Area=" + shape.getArea());
    }
}
