package com.hc.charp14;

public enum  SingletonEnum {
    INSTANCE;

    private byte[] data = new byte[1024];

    SingletonEnum(){
        System.out.println("INSTANCE will be initialized immediately");
    }

    public static void method(){

    }

    public static SingletonEnum getInstance(){
        return INSTANCE;
    }
}
