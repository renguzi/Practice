package com.journaldev.Thread;

import java.util.concurrent.*;

/**
 * @Author:asher
 * @Date:2020/10/9 17:18
 * @Description:com.journaldev.Thread
 * @Version:1.0
 */
class MyCallable1 implements Callable<String> {
    private long waitTime;

    public MyCallable1(long waitTime) {
        this.waitTime = waitTime;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        return Thread.currentThread().getName();
    }
}
public class FutureTaskExample {
    public static void main(String[] args) {
        MyCallable1 m1 = new MyCallable1(1000);
        MyCallable1 m2 = new MyCallable1(2000);
        Runnable r1 = () -> {System.out.println("r1111111111111");
            System.out.println("r222222222");};
        r1.run();
        new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous runnable");
            }
        }.run();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous thread");
            }
        }).start();

        FutureTask<String> futureTask1 = new FutureTask<>(m1);
        FutureTask<String> futureTask2 = new FutureTask<>(m2);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(futureTask1);
        executorService.execute(futureTask2);
        while (true) {
            try {
                if (futureTask1.isDone() && futureTask2.isDone()) {
                    System.out.println("done");
                    executorService.shutdown();
                    return;
                }
                if (!futureTask1.isDone()) {
                    System.out.println("FutureTask1 output=" + futureTask1.get());
                    System.out.println("Waiting for FutureTask2 to complete");
                    String s = futureTask2.get(200L, TimeUnit.MILLISECONDS);
                    if (s != null) {
                        System.out.println("FutureTask2 output=" + s);
                    }
                }
            } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (TimeoutException e) {
                    e.printStackTrace();
                }
            }
        }
    }