package com.atguigu.MultiThreads.Thread;

import org.junit.jupiter.api.Test;

/**
 * @Author:asher
 * @Date:2020/9/3 10:36
 * @Description:com.atguigu.MultiThreads.Thread
 * @Version:1.0
 */
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+" :"+i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+"Main: i= "+i);
            }
        }
//        t1.start();
        t1.run();
        t1.start();
        t1.start();
    }


}
