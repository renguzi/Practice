package com.journaldev.design.flyweight;

import java.awt.*;

/**
 * @Author:asher
 * @Date:2020/7/7 17:47
 * @Description:com.journaldev.design.flyweight
 * @Version:1.0
 */
public class Oval implements Shape{
    private boolean fill;

    public Oval(boolean f) {
        this.fill = f;
        System.out.println("Creating Oval object with fill=" + f);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color color) {
        g.setColor(color);
        g.drawLine(x, y, width, height);
        if (fill) {
            g.fillOval(x, y, width, height);
        }
    }
}
