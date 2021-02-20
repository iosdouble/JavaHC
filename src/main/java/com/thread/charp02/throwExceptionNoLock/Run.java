package com.thread.charp02.throwExceptionNoLock;

/**
 * com.thread.charp02.throwExceptionNoLock
 * create by admin nihui
 * create time 2021/2/20
 * version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(500);

            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
