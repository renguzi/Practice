package com.atguigu.MultiThreads.Thread.exer;

/**
 * @Author:asher
 * @Date:2020/9/3 16:15
 * @Description:com.atguigu.MultiThreads.Thread.exer
 * @Version:1.0
 * 通过实现Runnable接口来创建线程；
 * 1 创建1个实现Runnable接口的实现类；
 * 2 实现Runnable接口中的抽象方法run();
 * 3 创建1个实现类的对象；
 * 4 把实现类当作参数，用来创建1个Thread对象；
 * 5 通过Thread对象来调用start()方法。
 */
//1创建1个实现Runnable接口的类
class MThread implements Runnable {
    //2重写Runnable接口的抽象方法，run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        }
    }
}
public class RunnableCreateThread {
    public static void main(String[] args) {
        //3创建1个实现类的对象
        MThread mThread = new MThread();
        //4创建1个线程类的对象，把实现类的对象，当作参数传递进去
        Thread t1=new Thread(mThread,"我的名字");
//        t1.setName("xiancheng1:");
        //5通过线程对象调用start()方法。
        t1.start();
    }

}
