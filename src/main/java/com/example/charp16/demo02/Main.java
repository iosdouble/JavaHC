package com.example.charp16.demo02;

import java.util.concurrent.TimeUnit;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2019/7/19 7:21 PM
 * @Created by nihui
 */
public class Main {
    public static void main(String[] args) {
        Tableware fork = new Tableware("fork");
        Tableware knife = new Tableware("knife");

        new EatNoodleThread("A",fork,knife).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new EatNoodleThread("B",knife,fork).start();
    }
}
