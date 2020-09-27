package com.journaldev.Thread;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author:asher
 * @Date:2020/9/27 10:44
 * @Description:com.journaldev.Thread
 * @Version:1.0
 */
public class MyMonitorThread implements Runnable{
    private ThreadPoolExecutor executor;
    private int seconds;
    private boolean run=true;

    public MyMonitorThread(ThreadPoolExecutor executor, int seconds) {
        this.executor = executor;
        this.seconds = seconds;
    }

    public void shutdown() {
        this.run = false;
    }

    @Override
    public void run() {
        while (run) {
            System.out.println(String.format("[Monitor] [%d/%d] Active: %d,Completed: %d,Task: %d,isShutdown: %s,isTerminated: %s",
                    this.executor.getPoolSize(),
                    this.executor.getCorePoolSize(),
                    this.executor.getActiveCount(),
                    this.executor.getCompletedTaskCount(),
                    this.executor.getTaskCount(),
                    this.executor.isShutdown(),
                    this.executor.isTerminated()));
            try {
                Thread.sleep(seconds*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
