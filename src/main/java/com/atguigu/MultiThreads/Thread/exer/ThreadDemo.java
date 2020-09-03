package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/3 10:58
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 */
class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+" :"+i);
            }
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+" :"+i);
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
    MyThread1 myThread1 = new MyThread1();
    MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName()+" :"+i);
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName()+" :"+i);
                    }
                }
            }
        }.start();
    }
}
