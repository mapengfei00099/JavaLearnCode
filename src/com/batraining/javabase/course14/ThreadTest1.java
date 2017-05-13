package com.batraining.javabase.course14;

/**
 * Created by pengfei on 2017/5/8.
 */
public class ThreadTest1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            WriteThread1 thread1  =new WriteThread1();
            thread1.start();
        }
        Thread.sleep(2000L);
        System.out.println(WriteThread1.num);

    }
}
