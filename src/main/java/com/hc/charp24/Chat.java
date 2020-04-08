package com.hc.charp24;

import java.io.IOException;

/**
 * @Classname Chat
 * @Description TODO
 * @Date 2020/4/7 6:02 PM
 * @Created by nihui
 */
public class Chat {
    public static void main(String[] args) throws IOException {
        new ChatServer().startServer();
    }
}
