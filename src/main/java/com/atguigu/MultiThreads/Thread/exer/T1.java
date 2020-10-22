package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/10/10 15:46
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 */
public class T1  extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i % 20 == 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                System.out.println(Thread.currentThread().getState());
            }
        }
    }

    public static void main(String[] args) {
        T1 t1 = new T1();
        Thread t2 = new Thread(t1);
        t2.setName("分线程");
        Thread m1= Thread.currentThread();
        m1.setName("主线程");
        t2.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(m1.getName()+ " " + m1.getState() + "   "+i);
            if (i == 9) {


                try {
                    System.out.println("主线程状态为：" + Thread.currentThread().getState());
                    t2.join(20);
                    System.out.println("主线程状态为：" + Thread.currentThread().getState());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}


