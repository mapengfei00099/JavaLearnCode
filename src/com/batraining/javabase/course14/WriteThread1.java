package com.batraining.javabase.course14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengfei on 2017/5/8.
 */
public class WriteThread1 extends Thread {

public  static   int num =2;

    @Override
    public void run() {
        while (num<50) {
            num=num+2;
            //System.out.println(num);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
