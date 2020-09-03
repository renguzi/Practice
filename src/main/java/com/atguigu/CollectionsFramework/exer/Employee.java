package com.atguigu.CollectionsFramework.exer;

/**
 * @Author:asher
 * @Date:2020/8/31 09:16
 * @Description:com.atguigu.CollectionsFramework.exer
 * @Version:1.0
 */
public class Employee implements Comparable{
    private String name;
    private MyDate birthday;
    private int age;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                '}';
    }

    public Employee(String name, MyDate birthday, int age) {
        this.name = name;
        this.birthday = birthday;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee employee = (Employee) o;
            return this.getName().compareTo(employee.getName());
        }
        throw  new RuntimeException("输入的类型不匹配" );
    }
}
