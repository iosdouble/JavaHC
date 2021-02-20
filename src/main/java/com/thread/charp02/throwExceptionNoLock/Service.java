package com.thread.charp02.throwExceptionNoLock;

/**
 * com.thread.charp02.throwExceptionNoLock
 * create by admin nihui
 * create time 2021/1/18
 * version 1.0
 **/
public class Service {

    synchronized public void testMethod(){
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName="+Thread.currentThread().getName()+" run beginTime = "+System.currentTimeMillis());
            int i = 1;
            while (i==1){
                if ((""+Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName = "+Thread.currentThread().getName()+" run exceptionTime="+System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else {
            System.out.println("Thread B run Time = "+System.currentTimeMillis());
        }
    }
}
