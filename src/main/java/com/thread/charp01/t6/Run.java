package com.thread.charp01.t6;

/**
 * @Classname Run
 * @Description TODO
 * @Date 2019/10/31 5:31 PM
 * @Created by nihui
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
        myThread.start();
    }
}
