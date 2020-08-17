package com.atguigu.Reflection.StaticFactory;

/**
 * @Author:asher
 * @Date:2020/8/17 11:18
 * @Description:com.atguigu.Reflection.StaticFactory
 * @Version:1.0
 */
//被代理类
public class NikeClothFactory implements ClothFactory{
    @Override
    public void productCloth() {
        System.out.println("Nike工厂制造一批运动服");
    }
}
