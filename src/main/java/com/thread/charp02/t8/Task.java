package com.thread.charp02.t8;

/**
 * com.thread.charp02.t8
 * create by admin nihui
 * create time 2021/2/23
 * version 1.0
 **/
public class Task {

//   synchronized public void otherMethod(){
//        System.out.println("-------------------run--otherMethod");
//    }

     public void otherMethod(){
        System.out.println("-------------------run--otherMethod");
    }

    public void doLongTimeTask(){
        synchronized (this){
            for (int i = 0; i < 10000; i++) {

                System.out.println("synchronized threadName = "+ Thread.currentThread().getName()+" i= "+(i+1));
            }
        }
    }
}
