package com.atguigu.Generics.GenericMethod;

import java.util.List;

/**
 * @Author:asher
 * @Date:2020/8/6 16:32
 * @Description:com.atguigu.Generics.GenericMethod
 * @Version:1.0
 */
public class DAO<T> {
    //    定义通用的访问数据库表的操作
    public void add(T t) {

    }

    public void delete(T t) {

    }

    public void update(T t) {

    }

    public T select() {
        return null;
    }

    public List<T> selectAll() {
        return null;
    }
}
