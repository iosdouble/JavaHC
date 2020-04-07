package com.hc.charp24;

import com.hc.charp08.BasicThreadPool;
import com.hc.charp08.impl.ThreadPool;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname ChatServer
 * @Description TODO
 * @Date 2020/4/7 5:17 PM
 * @Created by nihui
 */
public class ChatServer {
    //服务端端口
    private final int port;

    //定义线程池，改线程池是在之前使用的
    private ThreadPool threadPool;

    //服务端的Socket
    private ServerSocket serverSocket;

    public ChatServer(int port) {
        this.port = port;
    }

    //定义一个默认端口
    public ChatServer() {
        this(13312);
    }

    public void startServer() throws IOException {
        //创建线程池，初始化一个线程，核心线程数为2，最大线程数为4，阻塞队列中最大可加入1000个任务
        this.threadPool = new BasicThreadPool(1,4,2,1000);
        this.serverSocket = new ServerSocket(port);
        this.serverSocket.setReuseAddress(true);
        System.out.println("Chat server is started and listen at port : "+port);
        this.listen();

    }

   private void  listen() throws IOException {
        while (true){
            Socket client = serverSocket.accept();
            this.threadPool.execute(new ClientHandler(client));
        }
   }

}
