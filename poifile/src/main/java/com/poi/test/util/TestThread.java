package com.poi.test.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread {
    public static void main(String[] args) {
        // 创建 CountDownLatch
        CountDownLatch countDownLatch = new CountDownLatch(2);
        // 创建固定线程数的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                // do something
                try {
                    // 让此任务执行 1.2s
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我是任务一");
                countDownLatch.countDown();
            }
        });
        // 任务二
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                // do something
                try {
                    // 让此任务执行 1.2s
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我是任务二");
                countDownLatch.countDown();
            }
        });

        // 等待任务执行完成
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("程序执行完成~");
    }

}
