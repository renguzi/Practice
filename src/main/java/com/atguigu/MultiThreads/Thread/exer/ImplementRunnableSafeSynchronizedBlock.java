package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/28 14:18
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 */
public class ImplementRunnableSafeSynchronizedBlock implements Runnable {
    private int ticket = 100;
    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        ImplementRunnableSafeSynchronizedBlock implementRunnableSafeSynchronizedBlock = new ImplementRunnableSafeSynchronizedBlock();
        Thread t1 = new Thread(implementRunnableSafeSynchronizedBlock);
        Thread t2 = new Thread(implementRunnableSafeSynchronizedBlock);
        Thread t3 = new Thread(implementRunnableSafeSynchronizedBlock);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
