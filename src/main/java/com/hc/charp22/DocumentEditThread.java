package com.hc.charp22;

import java.io.IOException;
import java.util.Scanner;

/**
 * @Classname DocumentEditThread
 * @Description TODO
 * @Date 2020/4/7 11:24 AM
 * @Created by nihui
 */
public class DocumentEditThread extends Thread {

    private final String documentPath;
    private final String documentName;
    private final Scanner scanner = new Scanner(System.in);

    public DocumentEditThread(String documentPath,String documentName){
        super("DocumentEditThread");
        this.documentPath = documentPath;
        this.documentName = documentName;
    }

    @Override
    public void run() {
        int time = 0;
        try{
            Document document =  Document.create(documentPath,documentName);
            while (true){
                //获取用户输入
                String text = scanner.next();
                if ("quit".equals(text)){
                    document.close();
                    break;
                }
                //将内容编辑到Document中
                document.edit(text);
                if (time == 5){
                    document.save();
                    time = 0;
                }
                time++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
