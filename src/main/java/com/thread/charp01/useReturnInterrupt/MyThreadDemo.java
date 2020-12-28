package com.thread.charp01.useReturnInterrupt;

/**
 * com.thread.charp01.useReturnInterrupt
 * create by admin nihui
 * create time 2020/12/28
 * version 1.0
 **/
public class MyThreadDemo extends Thread {
    @Override
    public void run() {
        //insert 操作
        if(this.interrupted()){
            System.out.println("写入 log info");
            return;
        }
        // update 操作
        if (this.interrupted()){
            System.out.println("写入 log info");
            return;
        }
        // delete 操作
        if (this.interrupted()){
            System.out.println("写入 log info");
            return;
        }
        // select 操作
        if (this.interrupted()){
            System.out.println("写入 log info");
            return;
        }
        System.out.println("for for for for for for");
    }
}
