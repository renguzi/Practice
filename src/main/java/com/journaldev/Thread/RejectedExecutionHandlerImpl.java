package com.journaldev.Thread;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author:asher
 * @Date:2020/9/27 10:43
 * @Description:com.journaldev.Thread
 * @Version:1.0
 */
public class RejectedExecutionHandlerImpl implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(r.toString() + "  is rejected");
    }
}
