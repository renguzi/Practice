package com.atguigu.MultiThreads.ThreadLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author:asher
 * @Date:2020/9/30 08:44
 * @Description:com.atguigu.MultiThreads.ThreadLock
 * @Version:1.0
 */
public class LockTest implements Runnable{
    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {

        while (true) {

            try{
                lock.lock();
                System.out.println(lock.isFair());
                System.out.println(lock.isHeldByCurrentThread());
                System.out.println(lock.isLocked());

//            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖票： 票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
//            }
        }
            finally {
                lock.unlock();

            }
            }
    }

    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
        Thread t1 = new Thread(lockTest);
        Thread t2 = new Thread(lockTest);
        Thread t3 = new Thread(lockTest);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
