package com.atguigu.Reflection.StaticFactory;

/**
 * @Author:asher
 * @Date:2020/8/17 11:16
 * @Description:com.atguigu.Reflection.StaticFactory
 * @Version:1.0
 */
//代理类
public class ProxyClothFactory implements ClothFactory {
    //代理类成员变量
    private ClothFactory factory;
    //通过构造函数来初始化成员变量，形参实际上是一个被代理类的对象实例
    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }
    @Override
    //将来调用被代理类的该方法时，实际上是调用了被代理类的该方法，因为factory实际上就是一个被代理类的对象
    public void productCloth() {
        System.out.println("代理类做一些准备工作");
        factory.productCloth();
        System.out.println("代理类做一些收尾工作");
    }
}
