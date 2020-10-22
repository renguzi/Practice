package com.journaldev.Thread.BlockingQueue;

import java.util.concurrent.BlockingQueue;

/**
 * @Author:asher
 * @Date:2020/10/10 14:47
 * @Description:com.journaldev.Thread.BlockingQueue
 * @Version:1.0
 */
public class Consumer implements Runnable{

    private BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> q){
        this.queue=q;
    }

    @Override
    public void run() {
        try{
            Message msg;
            //consuming messages until exit message is received
            while((msg = queue.take()).getMsg() !="exit"){
                Thread.sleep(10);
                System.out.println("Consumed "+msg.getMsg());
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
