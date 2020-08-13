package com.atguigu.IO.File;
import java.io.Serializable;
import java.util.HashMap;

/**
 * @Author:asher
 * @Date:2020/8/10 11:10
 * @Description:com.atguigu.IO.File
 * @Version:1.0
 */
public class Person implements Serializable {
    private static final long serialVersionUID= 42L;
    private int id;
    private String name;
    private final transient String addr = "厦门";
    private final transient String fav = new String("beer");
    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", fav='" + fav + '\'' +
                '}';
    }
}

