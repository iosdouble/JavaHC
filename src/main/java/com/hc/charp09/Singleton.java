package com.hc.charp09;

/**
 * @ClassName Singlten
 * @Author nihui
 * @Date 2019/5/10 21:31
 * @Version 1.0
 * @Description TODO
 */
public class Singleton {

    static {
        System.out.println("执行了静态代码块");
    }

    private static int a = 1;

    private static int b  ;

    //private static Singleton instance = new Singleton();
    private static Singleton instance;

    private Singleton(){
        System.out.println("执行初始化方法");
        a++;
        b++;
    }

    public static Singleton getInstance(){
        System.out.println("对象实例开始创建");
        if (instance !=null){
            System.out.println("类对象没有被初始化");
            instance = new Singleton();
        }
        System.out.println("创建对象完成");
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.a);
        System.out.println(singleton.b);
        System.out.println("=====通过类名直接调用====");
        System.out.println(Singleton.a);
        System.out.println(Singleton.b);
    }
}
