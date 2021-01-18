package com.thread.charp02.synLockIn02;

/**
 * com.thread.charp02.synLockIn02
 * create by admin nihui
 * create time 2021/1/18
 * version 1.0
 **/
public class Main {

    public int i = 10;

    synchronized public void operateIMainMethod(){
        try{
            i--;
            System.out.println("main print i = "+i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
