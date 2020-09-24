package com.journaldev.String;

/**
 * @Author:asher
 * @Date:2020/9/24 16:30
 * @Description:com.journaldev.String
 * @Version:1.0
 */

public class SwapString {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("world");
        Container container = new Container(s1, s2);
        System.out.println(swapString(container));
//        System.out.println(container);

    }

    public static Container swapString(Container container) {
        String s1 = container.getFirstString();
        String s2 = container.getSecondString();
        return new Container(s2, s1);

    }
}


class Container {
    private String firstString;
    private String secondString;

    public String getFirstString() {
        return firstString;
    }

    public void setFirstString(String firstString) {
        this.firstString = firstString;
    }

    public String getSecondString() {
        return secondString;
    }

    public void setSecondString(String secondString) {
        this.secondString = secondString;
    }

    public Container(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    @Override
    public String toString() {
        return "Container{" +
                "firstString='" + firstString + '\'' +
                ", secondString='" + secondString + '\'' +
                '}';
    }
}
