package com.atguigu.MultiThreads.Thread.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author:asher
 * @Date:2020/10/8 16:44
 * @Description:com.atguigu.MultiThreads.Thread.Callable
 * @Version:1.0
 */
class NumberCallable implements Callable {
    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
public class CallableThread {
    public static void main(String[] args) {
        NumberCallable numberCallable = new NumberCallable();
        FutureTask futureTask = new FutureTask(numberCallable);
        new Thread(futureTask).start();
        try {
            Object o = futureTask.get();
            System.out.println("0-100，偶数的和为：" + o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
