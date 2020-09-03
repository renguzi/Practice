package com.atguigu.ToolsClass;

/**
 * @Author:asher
 * @Date:2020/8/28 17:28
 * @Description:com.atguigu.ToolsClass
 * @Version:1.0
 */
public class Goods implements Comparable {
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods goods = (Goods) o;
            if (this.price > goods.price) {
                return 1;
            } else if (this.price < goods.price) {
                return -1;
            }else return -this.name.compareTo(goods.name);
        }
        throw new RuntimeException("输入的商品类型不匹配");
    }
}
