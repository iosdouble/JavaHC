package com.thread.charp01.suspendResumeDealLock;

/**
 * com.thread.charp01.suspendResumeDealLock
 * create by admin nihui
 * create time 2020/12/28
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            final SynchronizedObject object =  new SynchronizedObject();
            Thread thread1 = new Thread(){
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);

            Thread thread2 =  new Thread(){
                @Override
                public void run() {
                    System.out.println("Thread 2 启动了，但进入不了printString()方法 只能打印一个Begin");
                    System.out.println("因为pringString()方法被a线程锁定并且永远suspend暂停了！");
                    object.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
