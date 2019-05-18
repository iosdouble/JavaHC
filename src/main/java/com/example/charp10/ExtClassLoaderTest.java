package com.example.charp10;

/**
 * @ClassName ExtClassLoaderTest
 * @Author nihui
 * @Date 2019/5/12 16:10
 * @Version 1.0
 * @Description TODO
 */
public class ExtClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> test = Class.forName("com.example.charp10.Test");
        System.out.println(test.getClassLoader());
        System.out.println(System.getProperty("java.ext.dirs"));
    }
}
