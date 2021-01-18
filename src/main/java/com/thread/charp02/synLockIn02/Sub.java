package com.thread.charp02.synLockIn02;

/**
 * com.thread.charp02.synLockIn02
 * create by admin nihui
 * create time 2021/1/18
 * version 1.0
 **/
public class Sub extends Main {
    synchronized public void operateISubMethod(){
        try{
            while (i>0){
                i--;
                System.out.println("sub print i = "+i);
                Thread.sleep(100);
                super.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
