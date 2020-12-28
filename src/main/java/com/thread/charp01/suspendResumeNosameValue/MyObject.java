package com.thread.charp01.suspendResumeNosameValue;

/**
 * com.thread.charp01.suspendResumeNosameValue
 * create by admin nihui
 * create time 2020/12/28
 * version 1.0
 **/
public class MyObject {
    private String username = "1";
    private String password = "11";

    public void setValue(String u,String p){
        this.username = u;
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("停止 A 线程");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public void printUsernamePassword(){
        System.out.println(username + " "+ password);
    }
}
