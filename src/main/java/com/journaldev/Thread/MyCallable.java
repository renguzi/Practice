package com.journaldev.Thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author:asher
 * @Date:2020/9/25 17:50
 * @Description:com.journaldev.Thread
 * @Version:1.0
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(100);
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<String>> list = new ArrayList<Future<String>>();
        Callable<String> callable = new MyCallable();
        for (int i = 0; i < 100; i++) {
            Future<String> future = executorService.submit(callable);
            list.add(future);
        }
        for (Future<String> fut : list) {
            try {
                System.out.println(new Date() + "::" + fut.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch ( ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdownNow();
    }
}
