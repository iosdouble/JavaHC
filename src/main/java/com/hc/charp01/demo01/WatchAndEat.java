package com.hc.charp01.demo01;

import static java.lang.Thread.sleep;

/**
 * @ClassName WatchAndEat
 * @Author nihui
 * @Date 2019/4/27 19:49
 * @Version 1.0
 * @Description TODO
 */
public class WatchAndEat implements DoSomething{

    public void watch() throws InterruptedException {

        for (;;) {
            doWatch();
            sleep(1000);
        }

    }

    public void eat() throws InterruptedException {
        for (;;){
            doEat();
            sleep(1000);
        }
    }

    private  void doWatch() {
        System.out.println("我在看电视");
    }
    private void doEat(){
        System.out.println("我在吃饭");
    }
}
