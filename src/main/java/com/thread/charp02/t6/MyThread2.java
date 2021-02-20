package com.thread.charp02.t6;


/**
 * com.thread.charp02.t5
 * create by admin nihui
 * create time 2021/2/20
 * version 1.0
 **/
public class MyThread2 extends Thread {
    private Task task;

    public MyThread2(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
