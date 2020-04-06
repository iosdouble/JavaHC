package com.thread.charp01.t6;

/**
 * @Classname MyThread
 * @Description TODO
 * @Date 2019/10/31 5:28 PM
 * @Created by nihui
 */
public class MyThread extends Thread {


    public MyThread() {
        System.out.println("构造方法的打印："+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run 方法打印："+Thread.currentThread().getName());
    }
}
