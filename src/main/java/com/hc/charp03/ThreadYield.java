package com.hc.charp03;

import java.util.stream.IntStream;

/**
 * @ClassName ThreadYield
 * @Author nihui
 * @Date 2019/5/1 20:42
 * @Version 1.0
 * @Description TODO
 */
public class ThreadYield {
    public static void main(String[] args) {
        IntStream.range(0,2).mapToObj(ThreadYield::create).forEach(Thread::start);
    }
    private static Thread create(int index){
        return new Thread(()->{
//           if (index==0){
//               Thread.yield();
//           }
            System.out.println(index);
        });
    }
}
