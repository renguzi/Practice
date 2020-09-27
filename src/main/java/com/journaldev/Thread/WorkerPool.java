package com.journaldev.Thread;

import java.util.concurrent.*;

/**
 * @Author:asher
 * @Date:2020/9/27 10:49
 * @Description:com.journaldev.Thread
 * @Version:1.0
 */
public class WorkerPool {
    public static void main(String[] args) throws InterruptedException {
        RejectedExecutionHandlerImpl rejectedExecutionHandler = new RejectedExecutionHandlerImpl();
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        TimeUnit unit;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectedExecutionHandler);
        MyMonitorThread myMonitorThread = new MyMonitorThread(threadPoolExecutor, 3);
        Thread thread = new Thread(myMonitorThread);
        thread.start();
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(new WorkerThread("cmd" + i));
        }
        Thread.sleep(30000);
        threadPoolExecutor.shutdown();
        Thread.sleep(5000);
        myMonitorThread.shutdown();
    }
}
