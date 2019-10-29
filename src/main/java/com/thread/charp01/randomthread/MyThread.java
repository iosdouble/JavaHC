package com.thread.charp01.randomthread;

/**
 * @Classname MyThread
 * @Description TODO
 * @Date 2019/10/29 10:38 AM
 * @Created by nihui
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run= "+ Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
