package com.thread.charp01.t2;

/**
 * @Classname Run
 * @Description TODO
 * @Date 2019/10/29 1:26 PM
 * @Created by nihui
 */
public class Run {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束");
    }
}
