package com.hc.charp01.demo02;

/**
 * @ClassName Repoter
 * @Author nihui
 * @Date 2019/4/27 21:46
 * @Version 1.0
 * @Description TODO
 */
public class Repoter implements PrintMessage {
    public  void printNews() {
        print();
    }
    @Override
    public void print() {
        System.out.println("show news");
    }
}
