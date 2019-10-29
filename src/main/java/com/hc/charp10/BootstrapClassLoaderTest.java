package com.hc.charp10;

/**
 * @ClassName BootstrapClassLoaderTest
 * @Author nihui
 * @Date 2019/5/12 16:04
 * @Version 1.0
 * @Description TODO
 */
public class BootstrapClassLoaderTest {
    public static void main(String[] args) {
        System.out.println("Bootstrap:"+String.class.getClassLoader());
        System.out.println(System.getProperty("sun.boot.class.path"));
    }
}
