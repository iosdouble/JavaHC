package com.example.charp10;

/**
 * @ClassName NameSpace
 * @Author nihui
 * @Date 2019/5/12 17:44
 * @Version 1.0
 * @Description TODO
 */
public class NameSpace {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = NameSpace.class.getClassLoader();
        Class<?> aClass = classLoader.loadClass("com.example.charp10.Test");
        Class<?> bClass = classLoader.loadClass("com.example.charp10.Test");

        System.out.println(aClass.hashCode());
        System.out.println(bClass.hashCode());
        System.out.println(aClass == bClass);
    }
}
