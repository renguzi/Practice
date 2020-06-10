package com.journaldev.sort;

/**
 * @Author:asher
 * @Date:2020/6/8 17:05
 * @Description:com.journaldev.sort
 * @Version:1.0
 */
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public int compareTo(Employee o) {
        if (this.name.compareToIgnoreCase(o.name) < 0) {
            return -1;
        }
        if (this.name.compareToIgnoreCase(o.name) > 0) {
            return 1;
        }
        return 0;
    }
//
//    public int compareTo(Employee o) {
//        if (this.id < o.id) {
//            return -1;
//        }
//        if (this.id > o.id) {
//            return 1;
//        }
//        return 0;
//    }
}
