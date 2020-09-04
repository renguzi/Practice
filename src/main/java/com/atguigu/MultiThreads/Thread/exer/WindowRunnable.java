package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/4 10:12
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 * 用实现Runnable接口的方式来实现多线程并发卖票，100张。
 */
class Rwindow implements Runnable {
    private int ticket=100;
    @Override
    public void run() {
        while (ticket > 100) {
            System.out.println(Thread.currentThread().getName() + " 卖票：票号为，" + ticket);
            ticket--;
        }
    }
}
public class WindowRunnable {
    public static void main(String[] args) {
        Rwindow rwindow = new Rwindow();
        Thread t1 = new Thread(rwindow);
        Thread t2 = new Thread(rwindow);
        Thread t3 = new Thread(rwindow);
        t1.start();
        t2.start();
        t3.start();
    }
}
