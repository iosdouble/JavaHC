package com.hc.charp16.demo;

/**
 * @Classname Single_plankBridgeTest
 * @Description TODO
 * @Date 2019/7/19 5:15 PM
 * @Created by nihui
 */
public class Single_plankBridgeTest {
    static class Passengers extends Thread{
        private Single_plankBridge single_plankBridge;

        private final String idCard;

        private final String boardingPass;

        public Passengers(Single_plankBridge single_plankBridge, String idCard, String boardingPass) {
            this.single_plankBridge = single_plankBridge;
            this.idCard = idCard;
            this.boardingPass = boardingPass;
        }

        @Override
        public void run() {
            while (true){
                single_plankBridge.pass(boardingPass,idCard);
            }
        }
    }
    public static void main(String[] args) {
        final Single_plankBridge single_plankBridge = new Single_plankBridge();
        new Passengers(single_plankBridge,"A123456","AF123456").start();
        new Passengers(single_plankBridge,"B123456","BF123456").start();
        new Passengers(single_plankBridge,"C123456","CF123456").start();
    }
}
