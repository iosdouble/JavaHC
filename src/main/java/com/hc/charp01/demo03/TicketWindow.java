package com.hc.charp01.demo03;

/**
 * @ClassName TicketWindow
 * @Author nihui
 * @Date 2019/4/27 22:09
 * @Version 1.0
 * @Description TODO
 */
public class TicketWindow extends Thread {
    private final String name;

    private static final int MAX = 50;

    private int index = 1;

    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (index<MAX){
            System.out.println(name+" 号柜台,出号 "+index++);
        }
    }

    public static void main(String[] args){
        TicketWindow ticketWindow1 = new TicketWindow("一");
        ticketWindow1.start();

        TicketWindow ticketWindow2 = new TicketWindow("二");
        ticketWindow2.start();

        TicketWindow ticketWindow3 = new TicketWindow("三");
        ticketWindow3.start();

        TicketWindow ticketWindow4 = new TicketWindow("四");
        ticketWindow4.start();
    }
}
