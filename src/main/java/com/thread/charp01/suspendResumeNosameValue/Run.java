package com.thread.charp01.suspendResumeNosameValue;

/**
 * com.thread.charp01.suspendResumeNosameValue
 * create by admin nihui
 * create time 2020/12/28
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyObject myObject = new MyObject();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                myObject.setValue("a","aa");
            };
        };
        thread1.setName("a");
        thread1.start();

        Thread.sleep(500);

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                myObject.printUsernamePassword();
            };
        };
        thread2.start();
    }
}
