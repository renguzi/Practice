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
    private Object object = new Object();
    @Override
    public synchronized void  run() {
//        synchronized (object) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            while (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + " 卖票：票号为，" + ticket);
                ticket--;
            }
        }
//    }
}
public class WindowRunnable {
    public static void main(String[] args) {
        Rwindow rwindow = new Rwindow();
        Thread t1 = new Thread(rwindow);
        Thread t2 = new Thread(rwindow);
        Thread t3 = new Thread(rwindow);
        t2.start();
        t1.start();
        t3.start();
        System.out.println(t2.isAlive());
        System.out.println(t1.isAlive());
        System.out.println(t3.isAlive());
    }
}
