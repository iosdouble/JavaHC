package com.thread.charp01.question.q1;

import java.util.concurrent.TimeUnit;

/**
 * @Classname Run
 * @Description TODO
 * @Date 2019/10/30 6:55 PM
 * @Created by nihui
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable r1 = new MyRunnable("TE");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        t1.start();
        TimeUnit.SECONDS.sleep(10);
        t2.start();
    }
}
