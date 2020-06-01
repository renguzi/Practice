package com.journaldev.design;

/**
 * @Author:asher
 * @Date:2020/6/1 15:25
 * @Description:com.journaldev.design
 * @Version:1.0
 */
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public double getArea() {
        return this.height * this.width;
    }
}
