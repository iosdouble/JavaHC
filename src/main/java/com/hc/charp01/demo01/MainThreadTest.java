package com.hc.charp01.demo01;

/**
 * @ClassName MainThreadTest
 * @Author nihui
 * @Date 2019/4/27 20:08
 * @Version 1.0
 * @Description TODO
 */
public class MainThreadTest {
    public static void main(String[] args) throws InterruptedException {
        final WatchAndEat watchAndEat = new WatchAndEat();
        new Thread(()->{
            try {
                watchAndEat.eat();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        watchAndEat.watch();
    }
}
