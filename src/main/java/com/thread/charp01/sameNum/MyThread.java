package com.thread.charp01.sameNum;

/**
 * @Classname MyThread
 * @Description TODO
 * @Date 2019/10/31 4:30 PM
 * @Created by nihui
 */
public class MyThread extends Thread {
    private  int i = 5;

    @Override
    public void run() {
        System.out.println("i="+(i--)+" threadName= "+Thread.currentThread().getName());
    }
}
