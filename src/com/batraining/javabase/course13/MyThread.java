package com.batraining.javabase.course13;

/**
 * Created by pengfei on 2017/5/7.
 */
public class MyThread extends Thread {


    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() +",tid=" +this.getId()+"：" +i);
            try {
                Thread.sleep(10L);//单位毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
