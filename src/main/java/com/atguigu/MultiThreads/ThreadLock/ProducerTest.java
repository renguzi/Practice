package com.atguigu.MultiThreads.ThreadLock;

/**
 * @Author:asher
 * @Date:2020/10/8 15:13
 * @Description:com.atguigu.MultiThreads.ThreadLock
 * @Version:1.0
 */
class Clerk {
    private static int productCount=0;

    public synchronized void produceProduct() {
        if (productCount < 20) {
            notify();
            productCount++;
            System.out.println(Thread.currentThread().getName() + "开始生产第 " + productCount + " 个产品。");
        } else {
            //线程等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeProduct() {
        if (productCount > 0) {
            System.out.println(Thread.currentThread().getName() + "开始消费第 " + productCount + " 个产品");
            productCount--;
            notify();
        } else {
            //线程等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread {
 private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始生产产品....");
        while (true) {
        clerk.produceProduct();
        }
    }
}

class Customer extends Thread {
    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始消费产品...");
        while (true) {
        clerk.consumeProduct();
        }
    }
}
public class ProducerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        Customer c1 = new Customer(clerk);
        p1.setName("生产者1");
        c1.setName("消费者1");
        p1.start();
        c1.start();
    }
}
