package com.atguigu.CollectionsFramework.Map;

/**
 * @Author:asher
 * @Date:2020/9/1 09:25
 * @Description:com.atguigu.CollectionsFramework.Map
 * @Version:1.0
 */
public class User implements Comparable<User>{
    private int age;
    private String name;

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        int flag = this.age - o.getAge();
        if (flag == 0) {
            flag = this.getName().compareTo(o.getName());
        }
        return flag;
    }

//    @Override
//    public int compareTo(Object o) {
//        if (o instanceof User) {
//            int flag = this.age - ((User) o).age;
//            if (flag == 0) {
//                flag = this.getName().compareTo(((User) o).getName());
//            }
//            return flag;
//        }
//        throw new RuntimeException("输入的类型不匹配");
//    }
}
