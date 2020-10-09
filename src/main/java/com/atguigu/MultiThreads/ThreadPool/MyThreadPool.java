package com.atguigu.MultiThreads.ThreadPool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * @Author:asher
 * @Date:2020/10/9 15:40
 * @Description:com.atguigu.MultiThreads.ThreadPool
 * @Version:1.0
 */
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入3个整数");
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
}
public class MyThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        executorService.submit();
        executorService.execute(new MyRunnable());
        executorService.execute(new MyRunnable1());
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
//        Future<Integer> future = executorService.submit(new MyCallable());
//        try {
//            System.out.println(future.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
        System.out.println(executorService.getClass());
        ThreadPoolExecutor executor= (ThreadPoolExecutor) executorService;
        executor.setCorePoolSize(15);
        System.out.println(executor.getKeepAliveTime(TimeUnit.SECONDS));
        executorService.shutdown();
    }
}
