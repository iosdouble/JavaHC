package com.thread.charp02.t7;



/**
 * com.thread.charp02.t7
 * create by admin nihui
 * create time 2021/2/20
 * version 1.0
 **/
public class Task {

    public void doLongTimeTask(){
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadName= "+ Thread.currentThread().getName()+" i = "+(i+1));
        }
        System.out.println("");
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName = "+Thread.currentThread().getName()+" i = "+(i+1));
            }
        }
    }
}
