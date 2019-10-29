package com.hc.charp10;

/**
 * @ClassName ApplicationClassLoaderTest
 * @Author nihui
 * @Date 2019/5/12 16:22
 * @Version 1.0
 * @Description TODO
 */
public class ApplicationClassLoaderTest {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(ApplicationClassLoaderTest.class.getClassLoader());
    }
}
