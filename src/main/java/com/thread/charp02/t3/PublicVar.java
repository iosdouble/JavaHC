package com.thread.charp02.t3;

/**
 * com.thread.charp02.t3
 * create by admin nihui
 * create time 2020/12/30
 * version 1.0
 **/
public class PublicVar {
    public String username = "A";
    public String password = "AA";


    synchronized public void setValue(String username,String password){
        try{
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name = "+Thread.currentThread().getName()+" username = "+username+" password = "+password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getValue(){
        System.out.println("getValue method thread name = "+Thread.currentThread().getName()+" username = "+username+" password = "+password);
    }
}
