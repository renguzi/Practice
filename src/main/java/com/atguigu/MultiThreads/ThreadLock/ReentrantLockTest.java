package com.atguigu.MultiThreads.ThreadLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author:asher
 * @Date:2020/10/8 12:32
 * @Description:com.atguigu.MultiThreads.ThreadLock
 * @Version:1.0
 */
public class ReentrantLockTest extends Thread {
    private static int ticket=100;
    private static Lock lock=new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            try{
                lock.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "在卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new ReentrantLockTest();
        Thread t2 = new ReentrantLockTest();
        Thread t3 = new ReentrantLockTest();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
