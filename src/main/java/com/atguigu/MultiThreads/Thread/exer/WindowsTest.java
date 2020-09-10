package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/3 15:39
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 * 创建3个线程并发去卖票，一共有100张票。使用继承Thread类的方式来做。
 */
class Window extends Thread {
    private static int ticket=100;
    private static Object object = new Object();

    @Override
    public void run() {
            while (ticket > 0) {
                synchronized (Window.class) {
                System.out.println(getName() + "在卖票，票号为：" + ticket);
                ticket--;
            }
        }
    }

//    @Override
//    public void run() {
//                synchronized (object) {
//                    while (true) {
//                        if (ticket > 0) {
//                            System.out.println(Thread.currentThread().getName() + "在卖票，票号为： " + ticket);
//                            ticket--;
//                        } else {
//                            break;
//                        }
//                    }
//        }
//    }
}
public class WindowsTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();
        w1.setName("第1个窗口");
        w2.setName("第2个窗口");
        w3.setName("第3个窗口");
        w1.start();
        w2.start();
        w3.start();
    }
}
