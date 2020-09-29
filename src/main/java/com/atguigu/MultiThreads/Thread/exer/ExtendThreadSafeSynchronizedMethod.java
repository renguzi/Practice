package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/28 15:10
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 */
public class ExtendThreadSafeSynchronizedMethod extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        saleTicket();

    }

    private static synchronized void saleTicket() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }


    }

    public static void main(String[] args) {
        ExtendThreadSafeSynchronizedMethod e1 = new ExtendThreadSafeSynchronizedMethod();
        ExtendThreadSafeSynchronizedMethod e2 = new ExtendThreadSafeSynchronizedMethod();
        ExtendThreadSafeSynchronizedMethod e3 = new ExtendThreadSafeSynchronizedMethod();
        e1.setName("窗口1");
        e2.setName("窗口2");
        e3.setName("窗口3");
        e1.start();
        e2.start();
        e3.start();
    }
}
