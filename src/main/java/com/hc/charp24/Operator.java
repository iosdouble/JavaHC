package com.hc.charp24;

import com.hc.charp08.BasicThreadPool;
import com.hc.charp08.impl.ThreadPool;

/**
 * @Classname Operator
 * @Description TODO
 * @Date 2020/4/7 5:13 PM
 * @Created by nihui
 */
public class Operator {

    //使用线程池将每个请求线程管理起来
    private  final ThreadPool threadPool = new BasicThreadPool(2,6,4,1000);
    public void call(String business){
        TaskHandler taskHandler = new TaskHandler(new Request(business));
//        new Thread(taskHandler).start();
        threadPool.execute(taskHandler);
    }
}
