package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/28 08:45
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 */
public class Window2 extends Thread {
    private static int ticket=100;
    static Object object = new Object();

    @Override
    public void run() {
            while (true) {
                synchronized (object) {
                    if (ticket > 0) {
                        System.out.println(Thread.currentThread().getName() + " 买票，票号为：" + ticket);
                        ticket--;
                    } else {
                        break;
                    }
                }
        }
    }

    public static void main(String[] args) {
        Window2 window2 = new Window2();
        Window2 window21 = new Window2();
        Window2 window22 = new Window2();
        window2.setName("窗口1");
        window21.setName("窗口2");
        window22.setName("窗口3");
        window2.start();
        window21.start();
        window22.start();
    }
}
