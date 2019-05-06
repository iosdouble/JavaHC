package com.example.charp03;

/**
 * @ClassName ThreadPriority
 * @Author nihui
 * @Date 2019/5/1 21:01
 * @Version 1.0
 * @Description TODO
 */
public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
           while (true){
               System.out.println("我的优先级是三级");
           }
        });
        t1.setPriority(3);

        Thread t2 = new Thread(()->{
           while (true){
               System.out.println("我的优先级是十级");
           }
        });
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
