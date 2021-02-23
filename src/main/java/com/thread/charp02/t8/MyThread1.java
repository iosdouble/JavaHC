package com.thread.charp02.t8;

/**
 * com.thread.charp02.t8
 * create by admin nihui
 * create time 2021/2/23
 * version 1.0
 **/
public class MyThread1 extends Thread{

    private Task task;

    public MyThread1(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
