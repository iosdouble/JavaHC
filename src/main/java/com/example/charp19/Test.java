package com.example.charp19;

import java.util.concurrent.TimeUnit;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019/9/20 7:14 PM
 * @Created by nihui
 */
public class Test {
//    public static void main(String[] args) throws InterruptedException {
//        FutureService<Void,Void> service = FutureService.newService();
//        Future<?> future = service.submit(()->{
//           try {
//               TimeUnit.SECONDS.sleep(10);
//           }catch (InterruptedException e){
//               e.printStackTrace();
//           }
//            System.out.println("I am finish done.");
//        });
//        future.get();
//    }

//    public static void main(String[] args) throws InterruptedException {
//        FutureService<String, Integer> service = FutureService.newService();
//        Future<Integer> future = service.submit(input -> {
//            try {
//                TimeUnit.SECONDS.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("I am finish done.");
//            return input.length();
//        },"hello");
//        System.out.println(future.get());;
//    }

    public static void main(String[] args) throws InterruptedException {
        FutureService<String, Integer> service = FutureService.newService();
        Future<Integer> future = service.submit(input -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I am finish done.");
            return input.length();
        },"hello",System.out::println);

    }
}
