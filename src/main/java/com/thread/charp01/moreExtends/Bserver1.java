package com.thread.charp01.moreExtends;

/**
 * com.thread.charp01.moreExtends
 * create by admin nihui
 * create time 2020/12/23
 * version 1.0
 **/
public class Bserver1 extends Aserver implements Runnable {

    public void b_save_method(){
        System.out.println("b 中的保存数据方法被执行");
    }

    @Override
    public void run() {
        b_save_method();
    }
}
