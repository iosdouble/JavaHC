package com.thread.charp01.useReturnInterrupt;

/**
 * com.thread.charp01.useReturnInterrupt
 * create by admin nihui
 * create time 2020/12/28
 * version 1.0
 **/
public class MyThread extends Thread{

    @Override
    public void run() {
        while (true){
            if (this.isInterrupted()){
                System.out.println("停止了");
                return;
            }
            System.out.println("timer="+System.currentTimeMillis());
        }
    }
}
