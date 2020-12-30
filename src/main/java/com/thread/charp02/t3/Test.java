package com.thread.charp02.t3;

/**
 * com.thread.charp02.t3
 * create by admin nihui
 * create time 2020/12/30
 * version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        try{
            PublicVar publicVarRef = new PublicVar();
            ThreadA thread = new ThreadA(publicVarRef);
            thread.start();
            Thread.sleep(200);
            publicVarRef.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
