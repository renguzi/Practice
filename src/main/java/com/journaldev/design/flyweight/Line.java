package com.journaldev.design.flyweight;

import java.awt.*;

/**
 * @Author:asher
 * @Date:2020/7/7 17:45
 * @Description:com.journaldev.design.flyweight
 * @Version:1.0
 */
public class Line implements Shape {
    public Line() {
        System.out.println("Creating Line object");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void draw(Graphics line, int x, int y, int width, int height, Color color) {
        line.setColor(color);
        line.drawLine(x, y, width, height);
    }
}
