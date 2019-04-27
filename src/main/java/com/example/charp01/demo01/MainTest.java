package com.example.charp01.demo01;

/**
 * @ClassName MainTest
 * @Author nihui
 * @Date 2019/4/27 19:55
 * @Version 1.0
 * @Description TODO
 */
public class MainTest {
    /**
     * 首先描述一个单线程场景
     * 1.创建一个主线程入口
     * 2.创建一个看电视方法
     * 3.创建一个吃饭的方法
     *
     * 4.测试结果
     */
    public static void main(String[] args) throws InterruptedException {
        WatchAndEat watchAndEat = new WatchAndEat();
        watchAndEat.watch();
        watchAndEat.eat();
    }
}
