package com.poi.test.domain;


import java.util.concurrent.TimeUnit;

public class Ticket {
    Integer ticketNum = 8;

    public synchronized void reduce(int num){
        if(ticketNum-num>=0){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketNum -= num;
            System.out.println(Thread.currentThread().getName()+"成功卖出" + num +"张，剩余"+ticketNum+"张票");
        }else{
            System.out.println(Thread.currentThread().getName()+"没有买到票" + num +"张，剩余"+ticketNum+"张票");
        }

    }
}
