package com.journaldev.Thread;

/**
 * @Author:asher
 * @Date:2020/9/25 16:10
 * @Description:com.journaldev.Thread
 * @Version:1.0
 */
public class ThreadRunExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
        Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");
        System.out.println("Starting Runnable threads");
        t1.start();
        t2.start();
        System.out.println("Runnable Threads has been started");
        MyThread t3 = new MyThread("t3");
        MyThread t4 = new MyThread("t4");
        System.out.println("Starting MyThreads");
        t3.start();
        t4.start();
        System.out.println("MyThread has been started");
    }
}
