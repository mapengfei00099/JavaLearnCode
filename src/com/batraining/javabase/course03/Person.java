package com.batraining.javabase.course03;

/**
 * Created by pengfei on 2016/10/22.
 */
public class Person {
    String name;
    int age;

    public void work(){
        System.out.println("do work....");
    }

    public void call(){
        Phone phone  = new Phone("sumsung");

        phone.call();
    }

}
