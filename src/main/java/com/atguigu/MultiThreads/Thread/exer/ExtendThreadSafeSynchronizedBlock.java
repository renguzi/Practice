package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/28 10:42
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 */
public class ExtendThreadSafeSynchronizedBlock extends Thread {
    private static int ticket=100;
//    static Object object = new Object();

    @Override
    public void run() {
            while (true) {
                synchronized (ExtendThreadSafeSynchronizedBlock.class) {
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
        ExtendThreadSafeSynchronizedBlock e1 = new ExtendThreadSafeSynchronizedBlock();
        ExtendThreadSafeSynchronizedBlock e2 = new ExtendThreadSafeSynchronizedBlock();
        ExtendThreadSafeSynchronizedBlock e3 = new ExtendThreadSafeSynchronizedBlock();
        e1.setName("窗口1");
        e2.setName("窗口2");
        e3.setName("窗口3");
        e1.start();
        e2.start();
        e3.start();
    }
}
