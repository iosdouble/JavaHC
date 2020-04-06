package com.thread.charp01.t4_threadsafe;

/**
 * @Classname BLogin
 * @Description TODO
 * @Date 2019/10/31 4:12 PM
 * @Created by nihui
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
