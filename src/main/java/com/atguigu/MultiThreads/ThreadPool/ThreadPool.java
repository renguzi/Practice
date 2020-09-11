package com.atguigu.MultiThreads.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author:asher
 * @Date:2020/9/11 14:14
 * @Description:com.atguigu.MultiThreads.ThreadPool
 * @Version:1.0
 */
class NumberThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new NumberThread());
        System.out.println(executorService.getClass());
        ThreadPoolExecutor executor= (ThreadPoolExecutor) executorService;
        executor.setCorePoolSize(15);
        executor.shutdown();
    }
}
