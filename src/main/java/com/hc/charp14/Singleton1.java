package com.hc.charp14;

//懒汉式
public class Singleton1 {
    private byte[] bytes = new byte[1024];

    private static Singleton1 instance = null;

    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        if (instance!=null){
            instance = new Singleton1();
        }
        return instance;
    }

}
