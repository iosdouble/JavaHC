package com.hc.charp09;

/**
 * @ClassName Test
 * @Author nihui
 * @Date 2019/5/10 21:49
 * @Version 1.0
 * @Description TODO
 */
public class Test {

    //在父类中与静态变量value
    static class Parent{
        static  int value = 10;
        static {
            value = 20;
        }
    }

    static class Child extends Parent{
        static int i = value;
    }

    public static void main(String[] args) {
        System.out.println(Child.i);
    }
}
