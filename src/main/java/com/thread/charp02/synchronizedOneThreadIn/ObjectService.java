package com.thread.charp02.synchronizedOneThreadIn;

/**
 * com.thread.charp02.synchronizedOneThreadIn
 * create by admin nihui
 * create time 2021/2/20
 * version 1.0
 **/
public class ObjectService {

    public void serviceMethod(){
        try {
            synchronized (this){
                System.out.println("Begin time = "+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("End end = "+System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
