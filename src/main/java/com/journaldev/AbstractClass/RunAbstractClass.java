package com.journaldev.AbstractClass;

/**
 * @Author:asher
 * @Date:2020/6/1 10:05
 * @Description:com.journaldev.AbstractClass
 * @Version:1.0
 */
public abstract class RunAbstractClass {

    private String name;

    public abstract void changeName(String newName);

    public RunAbstractClass(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        RunAbstractClass runAbstractClass=new RunAbstractClass("java") {
            @Override
            public void changeName(String newName) {
//                this.getName();
            }
        };
//        runAbstractClass.name = "hello";
        System.out.println(runAbstractClass.getName());
        runAbstractClass.changeName("book");
        System.out.println(runAbstractClass.getName());
    }

}
