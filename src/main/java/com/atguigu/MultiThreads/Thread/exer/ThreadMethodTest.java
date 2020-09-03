package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/3 15:04
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 */
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+": "+i);
                try {
                   sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
public class ThreadMethodTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.setName("MyThreadName：");
        t1.start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
            if (i == 50) {
//                t1.yield();
                t1.join();
            }
        }
//        t1.start();
    }
}
