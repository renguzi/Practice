package com.journaldev.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:asher
 * @Date:2020/9/27 10:29
 * @Description:com.journaldev.Thread
 * @Version:1.0
 */
public class SimpleThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executorService.submit(worker);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {

        }
        System.out.println("Finished all threads.");
    }
}
