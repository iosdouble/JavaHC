package com.thread.charp01.t4_threadsafe;

/**
 * @Classname ALogin
 * @Description TODO
 * @Date 2019/10/31 4:11 PM
 * @Created by nihui
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
