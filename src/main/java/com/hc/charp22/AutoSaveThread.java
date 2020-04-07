package com.hc.charp22;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @Classname AutoSaveThread
 * @Description TODO
 * @Date 2020/4/7 11:21 AM
 * @Created by nihui
 */
public class AutoSaveThread extends Thread {

    private final Document document;


    public AutoSaveThread(Document document) {
        super("DocumentAutoSaveThread");
        this.document = document;
    }

    @Override
    public void run() {
        while (true){
            try {
                document.save();
                TimeUnit.SECONDS.sleep(1);
            } catch (IOException |InterruptedException e) {
               break;
            }
        }
    }
}
