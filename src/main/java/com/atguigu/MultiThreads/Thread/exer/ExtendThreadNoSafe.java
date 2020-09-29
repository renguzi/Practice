package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/28 10:38
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 */
public class ExtendThreadNoSafe extends Thread{
    private static int ticket=100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票：票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        ExtendThreadNoSafe e1 = new ExtendThreadNoSafe();
        ExtendThreadNoSafe e2 = new ExtendThreadNoSafe();
        ExtendThreadNoSafe e3 = new ExtendThreadNoSafe();
        e1.setName("窗口1");
        e2.setName("窗口2");
        e3.setName("窗口3");
        e1.start();
        e2.start();
        e3.start();
    }
}
