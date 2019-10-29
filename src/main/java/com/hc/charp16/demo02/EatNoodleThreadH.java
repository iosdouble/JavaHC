package com.hc.charp16.demo02;

/**
 * @Classname EatNoodleThreadH
 * @Description TODO
 * @Date 2019/7/19 7:37 PM
 * @Created by nihui
 */
public class EatNoodleThreadH extends Thread {
    private final String name;
    private final TablewarePair tablewarePair;

    public EatNoodleThreadH(String name, TablewarePair tablewarePair) {
        this.name = name;
        this.tablewarePair = tablewarePair;
    }

    @Override
    public void run() {
        while (true) {
            this.eat();
        }
    }

    private void eat() {
        synchronized (tablewarePair) {
            System.out.println(name + " take up " + tablewarePair + "(left)");

            System.out.println(name + " take up " + tablewarePair + "(right)");
            System.out.println(name + " is eating now.");
            System.out.println(name + " put down " + tablewarePair + "(right)");
            System.out.println(name + " put down " + tablewarePair + "(left)");
        }
    }
}
