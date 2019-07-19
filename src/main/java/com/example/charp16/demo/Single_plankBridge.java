package com.example.charp16.demo;

/**
 * @Classname Single_plankBridge
 * @Description TODO
 * @Date 2019/7/19 5:06 PM
 * @Created by nihui
 */
public class Single_plankBridge {
    private int count = 0;

    private String  boardingPass = "null";

    private String idCard = "null";

    public synchronized void pass(String boardingPass,String idCard){
        this.boardingPass = boardingPass;
        this.idCard = idCard;
        this.count++;
        check();
    }

    private void check() {
        if (boardingPass.charAt(0)!=idCard.charAt(0)){
            throw new RuntimeException("====Exception===="+toString());
        }
    }

    public String toString(){
        return "The "+count+" passengers, boardingPass= ["+boardingPass+"],idCard ["+idCard+"]";
    }
}
