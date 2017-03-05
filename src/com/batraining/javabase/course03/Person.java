package com.batraining.javabase.course03;

/**
 *
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
