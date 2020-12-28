package com.thread.charp01.useReturnInterrupt;

/**
 * com.thread.charp01.useReturnInterrupt
 * create by admin nihui
 * create time 2020/12/28
 * version 1.0
 **/
public class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            //insert 操作
            if (this.interrupted()) {
                throw new InterruptedException();
            }
            // update 操作
            if (this.interrupted()) {
                throw new InterruptedException();
            }
            // delete 操作
            if (this.interrupted()) {
                throw new InterruptedException();
            }
            // select 操作
            if (this.interrupted()) {
                throw new InterruptedException();
            }
            System.out.println("for for for for for for");
        }catch (InterruptedException e){
            System.out.println("写入 log info");
            e.printStackTrace();
        }
    }
}
