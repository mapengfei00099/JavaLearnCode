package com.batraining.javabase.course03;

import java.io.File;

/**
 * Created by pengfei on 2016/10/22.
 */
public class Student {
    private String name;
    private int age;
    private String schoolName;
    private String classRoom;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    public Student(String name, int age, String schoolName, String classRoom) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
        this.classRoom = classRoom;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public static void main(String[] args) {
        try {
            System.out.println("sou");
        } catch (Exception e) {
            e.printStackTrace();
        }
        File file = new File("F:/aa.txt");

    }
}
