package com.thread.charp01.t1.mythread;

/**
 * @Classname Run
 * @Description TODO
 * @Date 2019/10/29 10:37 AM
 * @Created by nihui
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
//        myThread.start();
        System.out.println("运行结束！");
    }
}
