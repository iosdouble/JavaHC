package com.thread.charp01.t4_threadsafe;

/**
 * @Classname LoginServlet
 * @Description TODO
 * @Date 2019/10/30 2:10 PM
 * @Created by nihui
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;


    public static void doPost(String username,String password){
        try{
            usernameRef = username;
            if (username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username= "+usernameRef+" password="+password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
