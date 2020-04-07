package com.hc.charp24;

import java.io.*;
import java.net.Socket;

/**
 * @Classname ClientHandler
 * @Description TODO
 * @Date 2020/4/7 5:24 PM
 * @Created by nihui
 */
public class ClientHandler implements Runnable {

    //客户端的socket连接
    private final Socket socket;
    //客户端的identity
    private final String clientIdentify;


    public ClientHandler(Socket client) {
        this.socket = client;
        this.clientIdentify = socket.getInetAddress().getHostAddress()+":"+client.getPort();
    }

    @Override
    public void run() {
        try{
            this.chat();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void chat() throws IOException {
        BufferedReader bufferedReader = wrap2Reader(this.socket.getInputStream());
        PrintStream printStream = wrap2Print(this.socket.getOutputStream());
        String received;
        while ((received=bufferedReader.readLine())!=null){
            System.out.printf("client:%s-message:%s\n",clientIdentify,received);
            if (received.equals("quit")){
                write2Client(printStream,"client will close");
                socket.close();
                break;
            }
            //向客户端发送消息
            write2Client(printStream,"Server : "+received);
        }
    }

    private void write2Client(PrintStream print, String message) {
        print.println(message);
        print.flush();
    }

    private PrintStream wrap2Print(OutputStream outputStream) {
        return new PrintStream(outputStream);
    }

    private BufferedReader wrap2Reader(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }
}
