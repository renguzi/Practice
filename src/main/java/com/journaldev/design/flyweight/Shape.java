package com.journaldev.design.flyweight;

import java.awt.*;

/**
 * @Author:asher
 * @Date:2020/7/7 17:44
 * @Description:com.journaldev.design.flyweight
 * @Version:1.0
 */
public interface Shape {
    public void draw(Graphics g, int x, int y, int width, int height, Color color);
}
