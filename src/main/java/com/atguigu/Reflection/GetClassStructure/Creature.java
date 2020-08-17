package com.atguigu.Reflection.GetClassStructure;

import java.io.Serializable;

/**
 * @Author:asher
 * @Date:2020/8/15 19:04
 * @Description:com.atguigu.Reflection.GetClassStructure
 * @Version:1.0
 */
public class Creature<T> implements Serializable {
    private char gender;
    private double weight;

    private void breath() {
        System.out.println("生物呼吸");
    }

    public void eat() {
        System.out.println("生物进食");
    }

}
