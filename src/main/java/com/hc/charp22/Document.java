package com.hc.charp22;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.currentThread;

/**
 * @Classname Document
 * @Description TODO 代表正在编辑的文档类
 * @Date 2020/4/7 11:10 AM
 * @Created by nihui
 */
public class Document {

    //如果文档发生改变，change 会被设置为true
    private boolean changed = false;
    //一次需要保持的内容，可以将其理解为内容缓存
    private List<String> content = new ArrayList<>();

    private final FileWriter writer;

    private static AutoSaveThread autoSaveThread;


    private Document(String documentPath,String documentName) throws IOException {
        this.writer = new FileWriter(new File(documentPath,documentName));
    }

    public static Document create(String documentPath,String documentName) throws IOException {
        Document document = new Document(documentPath,documentName);
        autoSaveThread = new AutoSaveThread(document);
        autoSaveThread.start();
        return document;
    }

    public void edit(String content){
        synchronized (this){
            this.content.add(content);
            this.changed = true;

        }
    }

    public void close() throws IOException {
        autoSaveThread.interrupt();
        writer.close();
    }

    public void save() throws IOException {
        synchronized(this){
            if (!changed){
                return;
            }
            System.out.println(currentThread()+" execute the save action ");
            for (String cacheLine:content){
                this.writer.write(cacheLine);
                this.writer.write("\r\n");
            }
            this.writer.flush();
            //将changed改为false，表明此刻没有新内容编辑了
            this.changed = false;
            this.content.clear();
        }
    }
}
