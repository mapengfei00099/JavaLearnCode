package com.batraining.javabase.course14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengfei on 2017/5/8.
 */
public class WriteThread extends Thread {

    public  static List<Integer> list = new ArrayList<Integer>();


    @Override
    public synchronized void run() {
        for (int i = 0; i <10; i++) {
                if (!list.contains(i)){
                    list.add(i);
                    System.out.println("add " +i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        }
    }
}
