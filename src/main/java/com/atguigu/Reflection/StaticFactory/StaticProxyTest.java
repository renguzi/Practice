package com.atguigu.Reflection.StaticFactory;

/**
 * @Author:asher
 * @Date:2020/8/17 11:19
 * @Description:com.atguigu.Reflection.StaticFactory
 * @Version:1.0
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        //1先创建1个被代理类的对象；
        NikeClothFactory nike = new NikeClothFactory();
        //2根据被代理类对象来创建1个代理类的对象；
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);
        //3调用被代理类的方法；
        proxyClothFactory.productCloth();
    }
}
