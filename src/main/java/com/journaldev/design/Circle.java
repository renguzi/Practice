package com.journaldev.design;

/**
 * @Author:asher
 * @Date:2020/6/1 15:23
 * @Description:com.journaldev.design
 * @Version:1.0
 */
public class Circle implements Shape{
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }
    public void draw() {
        System.out.println("Drawing Circle");

    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius() {
        return this.radius;
    }
}
