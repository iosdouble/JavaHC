package com.example.charp09;

/**
 * @ClassName TestSingle
 * @Author nihui
 * @Date 2019/5/11 22:57
 * @Version 1.0
 * @Description TODO
 */
public class TestSingleton {

    private static TestSingleton instance = new TestSingleton();

    private static int a = 0;

    private static int b;


    private TestSingleton() {
        a++;
        b++;
    }

    public static TestSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        TestSingleton singleton = TestSingleton.getInstance();
        System.out.println(singleton.a);
        System.out.println(singleton.b);
    }
}
