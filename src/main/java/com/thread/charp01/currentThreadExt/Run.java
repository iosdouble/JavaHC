package com.thread.charp01.currentThreadExt;

/**
 * @Classname Run
 * @Description TODO
 * @Date 2019/10/31 6:57 PM
 * @Created by nihui
 */
public class Run {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();
    }
}
