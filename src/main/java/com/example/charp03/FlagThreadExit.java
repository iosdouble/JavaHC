package com.example.charp03;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName FlagThreadExit
 * @Author nihui
 * @Date 2019/5/1 22:18
 * @Version 1.0
 * @Description TODO
 */
public class FlagThreadExit {
    static class MyTask extends Thread{
        private volatile boolean closed = false;

        @Override
        public void run() {
            System.out.println("开始工作!");
            while (!closed&&!isInterrupted()){

            }
            System.out.println("结束工作");
        }

        public void close(){
            this.closed = true;
            this.interrupt();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyTask t = new MyTask();
        t.start();
        TimeUnit.MINUTES.sleep(1);
        System.out.println("线程结束");
        t.close();
    }
}
