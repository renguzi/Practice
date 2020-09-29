package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/28 14:46
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 */
public class ImplementRunnableSafeSynchronizedMethod implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        saleTicket();
    }

    private synchronized void saleTicket() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                ticket--;
            } else {
                return;
            }
        }
    }

    public static void main(String[] args) {
        ImplementRunnableSafeSynchronizedMethod implementRunnableSafeSynchronizedMethod = new ImplementRunnableSafeSynchronizedMethod();
        Thread t1 = new Thread(implementRunnableSafeSynchronizedMethod);
        Thread t2 = new Thread(implementRunnableSafeSynchronizedMethod);
        Thread t3 = new Thread(implementRunnableSafeSynchronizedMethod);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
