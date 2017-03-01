package com.scujcc.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by David on 17/2/28.
 */

@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i){
         System.out.println("执行异步任务： " + i);
    }

    public void exectueAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务＋1: " + (i+1));
    }

}
