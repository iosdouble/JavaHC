package com.thread.charp01.currentThreadExt;

/**
 * @Classname CountOperate
 * @Description TODO
 * @Date 2019/10/31 5:32 PM
 * @Created by nihui
 */
public class CountOperate extends Thread {

    public CountOperate() {
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("run---end");
    }
}