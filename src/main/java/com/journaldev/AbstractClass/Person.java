package com.journaldev.AbstractClass;

/**
 * @Author:asher
 * @Date:2020/6/1 09:32
 * @Description:com.journaldev.AbstractClass
 * @Version:1.0
 */
public abstract class Person {
    private String name;
    private String gender;

    public Person(String nm, String gen) {
        this.name = nm;
        this.gender = gen;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void changeName(String newName) {
        this.name = newName;
    }

}
