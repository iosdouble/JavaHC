package com.hc.charp14;

public class Holder {
    private byte[] data = new byte[1024];

    private Holder(){

    }
    private static class Singleton{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstatnce(){
        return Singleton.instance;

    }
}
