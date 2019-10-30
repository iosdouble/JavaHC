package com.thread.charp01.question.q1;

/**
 * @Classname MyThread
 * @Description TODO
 * @Date 2019/10/30 6:43 PM
 * @Created by nihui
 */
public class MyThread extends Thread {
//    private int i = 5;
//    @Override
//    public void run() {
//        while (i>0){
//            i--;
//            System.out.println(i);
//        }
//    }

    public void print(){
        int a = 5;
        a--;
        System.out.println(currentThread().getName() + "  "+a);
    }

    @Override
    public void run() {
        print();
    }
}
