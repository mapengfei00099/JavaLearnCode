package com.batraining.javabase.course13;

/**
 * Created by pengfei on 2017/5/7.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"：" +i);
        }
    }
}
