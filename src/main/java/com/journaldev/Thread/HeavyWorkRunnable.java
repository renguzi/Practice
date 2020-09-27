package com.journaldev.Thread;

/**
 * @Author:asher
 * @Date:2020/9/25 16:04
 * @Description:com.journaldev.Thread
 * @Version:1.0
 */
public class HeavyWorkRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Doing Heavy processing -START " + Thread.currentThread().getName());
        try {
            Thread.sleep(100);
            dbProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing Heavy processing -END " + Thread.currentThread().getName());
    }

    private void dbProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
}
