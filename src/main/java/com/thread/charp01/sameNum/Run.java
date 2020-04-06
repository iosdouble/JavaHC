package com.thread.charp01.sameNum;


/**
 * @Classname Run
 * @Description TODO
 * @Date 2019/10/31 4:32 PM
 * @Created by nihui
 */
public class Run {
    public static void main(String[] args) {
        MyThread run = new MyThread();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        Thread t5 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
