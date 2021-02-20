package com.thread.charp02.synNotExtends;

/**
 * com.thread.charp02.synNotExtends
 * create by admin nihui
 * create time 2021/2/20
 * version 1.0
 **/
public class Main {

    synchronized public void serviceMethod(){
        try{
            System.out.println("init main 下一步 sleep begin ThreadName= "+Thread.currentThread().getName()+" time = "+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("init main 下一步 sleep end threadName= "+Thread.currentThread().getName()+" time = "+System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
