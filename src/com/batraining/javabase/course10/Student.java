package com.batraining.javabase.course10;

import java.util.Comparator;

/**
 * Created by pengfei on 2017/4/9.
 */
public class Student implements Comparable {
    private int stuNum;
    private String name;

    public Student(int stuNum, String name) {
        this.stuNum = stuNum;
        this.name = name;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (stuNum != student.stuNum) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = stuNum;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("你调用了compareTo接口");
        if(o instanceof Student){
            Student temp = (Student)o;
            if(this.stuNum>temp.stuNum){
                return 1;
            }else if(this.stuNum== temp.stuNum){
                return 0;
            }else {
                return -1;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum=" + stuNum +
                ", name='" + name + '\'' +
                '}';
    }
}
