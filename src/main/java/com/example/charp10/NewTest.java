package com.example.charp10;

import java.lang.reflect.Method;

/**
 * @ClassName NewTest
 * @Author nihui
 * @Date 2019/5/12 17:26
 * @Version 1.0
 * @Description TODO
 */
public class NewTest {
    public static void main(String[] args) throws Exception {
        BrokerDelegateClassLoader brokerclassLoader = new BrokerDelegateClassLoader();
        MyClassLoader classLoader = new MyClassLoader();

        Class<?> mClass = classLoader.loadClass("com.example.charp10.Test");
        Class<?> bClass = brokerclassLoader.loadClass("com.example.charp10.Test");


        System.out.println(mClass.getClassLoader());
        System.out.println(bClass.getClassLoader());

        System.out.println(mClass.hashCode());
        System.out.println(bClass.hashCode());
        System.out.println(mClass==bClass);

    }
}
