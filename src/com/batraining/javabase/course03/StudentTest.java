package com.batraining.javabase.course03;

/**
 * Created by pengfei on 2016/10/22.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("xiaotang",21);
        System.out.println(student.getAge());
        System.out.println(student.getName());
        student.setClassRoom("301");
        System.out.println(student.getClassRoom());



    }
}
