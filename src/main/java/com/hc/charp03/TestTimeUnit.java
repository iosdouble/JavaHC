package com.hc.charp03;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestTimeUnit
 * @Author nihui
 * @Date 2019/5/1 20:37
 * @Version 1.0
 * @Description TODO
 */
public class TestTimeUnit {

    public static void main(String[] args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        TimeUnit.HOURS.sleep(1);
        TimeUnit.MINUTES.sleep(1);
        TimeUnit.MILLISECONDS.sleep(1);
    }
}
