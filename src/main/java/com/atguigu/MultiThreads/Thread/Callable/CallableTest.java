package com.atguigu.MultiThreads.Thread.Callable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author:asher
 * @Date:2020/10/9 10:57
 * @Description:com.atguigu.MultiThreads.Thread.Callable
 * @Version:1.0
 */
class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        Collections.sort(list);
        return list.get(list.size() - 1)+Thread.currentThread().getName();
//        return null;
    }
}
public class CallableTest {
    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(myCallable);

        Thread t1=new Thread(futureTask, "我的线程");
        t1.start();

        try {
            String s = futureTask.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
