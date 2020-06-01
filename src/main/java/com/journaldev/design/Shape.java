package com.journaldev.design;

/**
 * @Author:asher
 * @Date:2020/6/1 11:30
 * @Description:com.journaldev.design
 * @Version:1.0
 */
public interface Shape {
    public static final String LABEL = "Shape";

    public abstract void draw();

    public abstract double getArea();
}
