package com.batraining.javabase.course04;

/**
 * Created by pengfei on 2016/12/18.
 */
public class Student extends Person {

    private String stuNum;//学号

    public Student() {
        super("fa",2,'男');
        System.out.println("student gouzao1");
    }

    public Student(String name, int age, char sex, String stuNum) {
        this.stuNum = stuNum;
    }
    @Override
   public void doSomeThing(){
       System.out.println("学习中。。。。" + this.getName());
   }


   @Override
   public void eat(){
      System.out.print("eat xueshengcang");
   }

   public void play(){
       System.out.println("fdas");
   }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }


}
