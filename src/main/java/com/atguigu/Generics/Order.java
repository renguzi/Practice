package com.atguigu.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:asher
 * @Date:2020/8/6 11:05
 * @Description:com.atguigu.Generics
 * @Version:1.0
 */
public class Order<T> {
    String orderName;
    int orderId;
    T orderT;

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public Order() {
    }

    public Order(String name, int id, T orderT) {
        this.orderName = name;
        this.orderId = id;
        this.orderT = orderT;
    }
//    泛型方法
    public <E> List<E> copyFromArrayToList(E[] arr) {
        List<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }
}
