package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/27 11:25
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 */
public class Window1 implements Runnable {
    private int ticket=100;

    @Override
    public void run() {
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
        Window1 window1 = new Window1();
        Thread t1 = new Thread(window1);
        Thread t2 = new Thread(window1);
        Thread t3 = new Thread(window1);
        t1.setName("第一个窗口");
        t2.setName("窗口二");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
