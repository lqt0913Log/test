package com.poi.test.util;

import com.poi.test.domain.Ticket;

public class TestUtil {
    public static void main(String[] args) throws InterruptedException {
        Long start = System.currentTimeMillis();
        test();
        Long end = System.currentTimeMillis();
        System.out.println("耗时" +(end-start)+"毫秒");
    }

    private static void test() throws InterruptedException {
        Ticket ticket = new Ticket();
        for (int i = 0; i <10 ; i++) {
            new Thread(() -> ticket.reduce(1),"用户"+(i+1)).start();
        }
        Thread.sleep(1000L);
    }
}
