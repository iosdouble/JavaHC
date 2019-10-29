package com.hc.charp14;

//懒加载+同步
public class Singleton2 {

    private byte[] data = new byte[1024];

    private static Singleton2 instance = new Singleton2();

    private Singleton2(){

    }

    public static synchronized  Singleton2 getInstance(){
        if (null!=instance){
            instance = new Singleton2();
        }
        return instance;
    }
}
