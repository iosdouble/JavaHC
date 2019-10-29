package com.hc.charp09;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @ClassName Init
 * @Author nihui
 * @Date 2019/5/11 22:30
 * @Version 1.0
 * @Description TODO
 */
public class Init {
    static {
        try{
            System.out.println("The init static code block will be invoke.");
            TimeUnit.MINUTES.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        IntStream.range(0,5).forEach(i->new Thread(Init::new));
    }
}
