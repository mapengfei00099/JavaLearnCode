package com.batraining.javabase.course05;

/**
 * Created by pengfei on 2017/1/10.
 */
public class Animal {
    private int num;

    private String name;
    public  static int couter;


    static{

        System.out.println("11111");

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        System.out.println(Animal.couter);
        System.out.println( Animal.couter);

    }




}
