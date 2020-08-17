package com.atguigu.Reflection.DynamicProxy;

/**
 * @Author:asher
 * @Date:2020/8/17 11:03
 * @Description:com.atguigu.Reflection.DynamicProxy
 * @Version:1.0
 */
//被代理类
public class SuperMan implements Human{
    @Override
    public String getBelief() {
        return "I believe I can fly.";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}
