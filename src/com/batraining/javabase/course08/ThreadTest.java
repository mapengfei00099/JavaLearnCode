package com.batraining.javabase.course08;

import java.util.Date;
import java.util.*;//导入整个包里面的类

/**
 * Created by pengfei on 2017/3/26.
 */
public class ThreadTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        };
        new Thread(runnable).start();

    }

}
