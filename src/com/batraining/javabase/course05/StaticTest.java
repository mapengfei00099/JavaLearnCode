package com.batraining.javabase.course05;

/**
 * Created by pengfei on 2017/1/10.
 */
public class StaticTest {
   private static Person p= new Person();
   static {
       //p = new Person();
       System.out.println("test2");
   }

    public static void main(String[] args) {
        System.out.println("main");
    }

}
