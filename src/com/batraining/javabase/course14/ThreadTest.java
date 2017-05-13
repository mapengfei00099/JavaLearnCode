package com.batraining.javabase.course14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengfei on 2017/5/8.
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            WriteThread t2= new WriteThread();
            t2.start();
        }
        //估算上面10个线程运行结束的时间
        Thread.sleep(5000L);
        System.out.println("最后的list："+WriteThread.list);



    }
}
