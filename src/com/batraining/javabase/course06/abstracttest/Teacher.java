package com.batraining.javabase.course06.abstracttest;

/**
 *
 */
public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name, int age, char sex) {
          super(name,age,sex);

    }


    @Override
    public void doSomeThing(){
        //一中各表
        System.out.println("教学中");
    }


}
