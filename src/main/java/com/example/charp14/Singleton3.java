package com.example.charp14;

import java.net.Socket;
import java.sql.Connection;

public class Singleton3 {

    private byte[] data = new byte[1024];

    private  volatile static Singleton3 instance = null;

    Connection conn;

    Socket socket;


    private Singleton3(){
//        this.conn;
//        this.socket;
    }

    public static Singleton3 getInstance(){
        //当instance为null的时候，进入同步代码块，同时该判断也避免了每个线程都进入到同步代码块，可以提高效率
        if (null==instance){
            synchronized (Singleton3.class){
                //只有一个线程可以获取到Singleton3的锁
                if (null==instance){
                    //如果instance为空则创建
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}
