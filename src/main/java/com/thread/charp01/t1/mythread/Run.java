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
        myThread.start(); // 耗时大
        System.out.println("运行结束！"); //耗时小
    }

    /***
     * 通过上面start方法启动一个线程，线程启动后悔自动调用对象中的run()方法，
     * run()方法里面的代码就是线程对象需要执行的任务，也是线程的入口。
     */
}
