package com.hc.charp10;

/**
 * @ClassName MyClassLoaderTest
 * @Author nihui
 * @Date 2019/5/12 16:47
 * @Version 1.0
 * @Description TODO
 */
public class MyClassLoaderTest {
    public static void main(String[] args) throws Exception {
        MyClassLoader aclassLoader = new MyClassLoader("target/classes/",null);
        MyClassLoader bclassLoader = new MyClassLoader("target/classes/",null);

        Class<?> aClass = aclassLoader.loadClass("com.hc.charp10.Test");
        Class<?> bClass = bclassLoader.loadClass("com.hc.charp10.Test");

        System.out.println(aClass.getClassLoader());
        System.out.println(bClass.getClassLoader());

        System.out.println(aClass.hashCode());
        System.out.println(bClass.hashCode());
        System.out.println(aClass==bClass);

//        System.out.println(mClass.getClassLoader());
//
//        Object test = mClass.newInstance();
//        System.out.println(test);
//        Method sayHelloMethod = mClass.getMethod("sayHello");
//        String result = (String) sayHelloMethod.invoke(test);
//        System.out.println("Result:"+result);

    }
}
