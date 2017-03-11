package com.batraining.javabase.course06.abstracttest;

//抽象类可以包含抽象方法，也可以不包含抽象方法，
// 如果一个类包含抽象方法，那么这个类必须是抽象类
public abstract class Person {


    private String name;
    private int age ;
    private char sex;



    public Person() {
        System.out.println("person gouzao1");
    }



    public Person(String name, int age, char sex) {
        System.out.println("gouzao4");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //抽象方法，不需要方法的实现
    public abstract void doSomeThing();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }




}
