package com.journaldev.design.flyweight;

import com.sun.tools.corba.se.idl.StructEntry;

import java.util.HashMap;

/**
 * @Author:asher
 * @Date:2020/7/7 17:50
 * @Description:com.journaldev.design.flyweight
 * @Version:1.0
 */
public class ShapeFactory {
    private static final HashMap<ShapeType,Shape> shapes=new HashMap<ShapeType,Shape>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);
        if (shapeImpl == null) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new Oval(true);
            } else if (type.equals(ShapeType.LINE)) {
                shapeImpl = new Line();
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }
    public static enum ShapeType{
        OVAL_FILL,OVAL_NOFILL,LINE;
    }
}
