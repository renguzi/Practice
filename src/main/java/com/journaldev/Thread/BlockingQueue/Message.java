package com.journaldev.Thread.BlockingQueue;

/**
 * @Author:asher
 * @Date:2020/10/10 14:42
 * @Description:com.journaldev.Thread.BlockingQueue
 * @Version:1.0
 */
public class Message {
    private String msg;

    public Message(String str){
        this.msg=str;
    }

    public String getMsg() {
        return msg;
    }

}
