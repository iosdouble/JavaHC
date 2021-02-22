package com.thread.charp02.doubleSynBlockOneTwo;

/**
 * com.thread.charp02.doubleSynBlockOneTwo
 * create by admin nihui
 * create time 2021/2/22
 * version 1.0
 **/
public class ObjectService {

    public void serviceMethodA(){
        try{
            synchronized (this){
                System.out.println("A begin time = "+System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end end = "+ System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void serviceMethodB(){
        synchronized (this){
            System.out.println("B begin time = "+System.currentTimeMillis());
            System.out.println("B end end = "+System.currentTimeMillis());
        }
    }
}
