package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/28 11:12
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 */
public class ImplementRunnableNoSafe implements Runnable {
    private int ticket=100;
    @Override
    public void run() {
        while (true) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + " 卖票：票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
    }

    public static void main(String[] args) {
        ImplementRunnableNoSafe implementRunnableNoSafe = new ImplementRunnableNoSafe();
        Thread t1 = new Thread(implementRunnableNoSafe);
        Thread t2 = new Thread(implementRunnableNoSafe);
        Thread t3 = new Thread(implementRunnableNoSafe);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
