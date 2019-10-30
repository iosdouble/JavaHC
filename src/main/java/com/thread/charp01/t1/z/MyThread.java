package com.thread.charp01.t1.z;

/**
 * @Classname MyThread
 * @Description TODO
 * @Date 2019/10/29 1:22 PM
 * @Created by nihui
 */
public class MyThread extends Thread {
    private int i;
    public MyThread(int i){
        super();
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println(i);
    }
}
