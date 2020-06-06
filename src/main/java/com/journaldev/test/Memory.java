package com.journaldev.test;

/**
 * @Author:asher
 * @Date:2020/6/6 23:03
 * @Description:com.journaldev.test
 * @Version:1.0
 */
public class Memory {
    public static void main(String[] args) { //line1
        int i=1;        //line2
        Object object = new Object();       //line3
        Memory memory = new Memory();       //line4
        memory.foo(object);                 //line5
    }                                       //line9

    private void foo(Object param) {        //line6
        String string = param.toString();   //line7
        System.out.println(string);
    }                                       //line8
}
