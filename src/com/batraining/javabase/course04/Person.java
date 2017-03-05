package com.batraining.javabase.course04;


/**
 * Created by pengfei on 2016/12/18.
 */
public class Person {


    private String name;
    private int age ;
    private char sex;
    //cho


    public Person() {
        System.out.println("person gouzao1");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, char sex) {
        System.out.println("gouzao4");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void eat()
    {
        System.out.println("eating food ");
    }
    public void doSomeThing(){

    }

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
