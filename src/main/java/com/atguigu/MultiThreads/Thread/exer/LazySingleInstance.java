package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/29 15:50
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 */
public class LazySingleInstance {

    private LazySingleInstance() {
    }

    private static LazySingleInstance instance = null;

    public static  LazySingleInstance getInstance() {
        synchronized (LazySingleInstance.class) {
            if (instance == null) {
                instance = new LazySingleInstance();
            }
        }
        return instance;
    }
}
