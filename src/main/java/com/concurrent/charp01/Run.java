package com.concurrent.charp01;

/**
 * @Classname Run
 * @Description TODO
 * @Date 2020/6/16 10:17 AM
 * @Created by nihui
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");


        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");

        ThreadC threadC = new ThreadC(service);
        threadC.setName("C");

        threadA.start();
        threadB.start();
        threadC.start();

    }
}
