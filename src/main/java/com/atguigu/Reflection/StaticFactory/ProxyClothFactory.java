package com.atguigu.Reflection.StaticFactory;

/**
 * @Author:asher
 * @Date:2020/8/17 11:16
 * @Description:com.atguigu.Reflection.StaticFactory
 * @Version:1.0
 */
public class ProxyClothFactory implements ClothFactory {
    private ClothFactory factory;

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }
    @Override
    public void productCloth() {
        System.out.println("代理类做一些准备工作");
        factory.productCloth();
        System.out.println("代理类做一些收尾工作");
    }
}
