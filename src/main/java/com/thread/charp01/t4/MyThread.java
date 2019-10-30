package com.thread.charp01.t4;

/**
 * @Classname MyThread
 * @Description TODO
 * @Date 2019/10/29 2:35 PM
 * @Created by nihui
 */
public class MyThread extends Thread {
    private int count = 5;
    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由 "+currentThread().getName()+ " 计算， count = "+count);
    }
}
