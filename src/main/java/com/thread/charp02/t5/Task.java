package com.thread.charp02.t5;

/**
 * com.thread.charp02.t5
 * create by admin nihui
 * create time 2021/2/20
 * version 1.0
 **/
public class Task {
    private String getDate1;
    private String getDate2;

    public synchronized void doLongTimeTask(){
        try{
            System.out.println("begin task");
            Thread.sleep(3000);
            getDate1 = "长时间处理任务后从远程返回值1 threadName = "+Thread.currentThread().getName();
            getDate2 = "长时间处理任务后从远程返回值2 threadName = "+Thread.currentThread().getName();

            System.out.println(getDate1);
            System.out.println(getDate2);
            System.out.println("end task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
