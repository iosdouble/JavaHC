package com.thread.charp02.t2;

/**
 * com.thread.charp02.t2
 * create by admin nihui
 * create time 2020/12/29
 * version 1.0
 **/
public class HasSelfPrivateNum {
    private int num = 0;

    public void addI(String username){
        try{
            if (username.equals("a")){
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num = "+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
