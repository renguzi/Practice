package com.journaldev.Thread;

/**
 * @Author:asher
 * @Date:2020/9/25 16:07
 * @Description:com.journaldev.Thread
 * @Version:1.0
 */
public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("MyThread -START " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            dbProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread -END " + Thread.currentThread().getName());
    }

    private void dbProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
}
