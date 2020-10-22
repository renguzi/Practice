package com.journaldev.Thread;

import java.util.Date;

/**
 * @Author:asher
 * @Date:2020/10/10 16:18
 * @Description:com.journaldev.Thread
 * @Version:1.0
 */
class NewRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started:: " + Thread.currentThread().getName()+ new Date());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:: " + Thread.currentThread().getName()+ new Date());
    }
}
public class ThreadJoinExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NewRunnable(), "t1");
        Thread t2 = new Thread(new NewRunnable(), "t2");
        Thread t3 = new Thread(new NewRunnable(), "t3");
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All thread are dead,exiting main thread");
    }
}
