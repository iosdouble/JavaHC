package com.thread.charp02.t5;

/**
 * com.thread.charp02.t5
 * create by admin nihui
 * create time 2021/2/20
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();

        MyThread2 thread2 = new MyThread2(task);
        thread2.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime2<CommonUtils.beginTime1){
            beginTime = CommonUtils.beginTime2;
        }

        long endTime = CommonUtils.endTime1;
        if (CommonUtils.endTime2<CommonUtils.endTime1){
            endTime = CommonUtils.endTime2;
        }
        System.out.println("耗时： "+(endTime-beginTime)/1000);
    }
}