package com.batraining.javabase.course10;

import java.util.TreeSet;

/**
 * Created by pengfei on 2017/4/9.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        //TreeSet实现了SortedSet接口，具有排序功能
        TreeSet treeSet = new TreeSet();
        //每次调用add的时候就会进行排序
        treeSet.add(101);
        treeSet.add(23);
        treeSet.add(87);
        treeSet.add(29);
        System.out.println(treeSet);
        //上面的排序是通过Integer 中compareTo 方法进行比较的

        Student s1 = new Student(10,"张三");
        Student s2 = new Student(5,"李四");
        TreeSet studentSet = new TreeSet();
        studentSet.add(s1);
        studentSet.add(s2);
        System.out.println(studentSet);



    }
}
