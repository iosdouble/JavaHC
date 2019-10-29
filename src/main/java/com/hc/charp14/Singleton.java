package com.hc.charp14;

public class Singleton {
    private byte[] data = new byte[1024];

    private static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }
}
