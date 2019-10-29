package com.hc.charp14;

public class NewSingleton {
    private byte[] data = new byte[1024];

    private NewSingleton(){

    }

    private enum EnumHolder{
        INSTANCE;

        private NewSingleton instance;


        EnumHolder(){
            this.instance = new NewSingleton();
        }


        private  NewSingleton getInstance(){
            return instance;
        }
    }

    public static NewSingleton getInstance(){
        return EnumHolder.INSTANCE.getInstance();
    }
}
