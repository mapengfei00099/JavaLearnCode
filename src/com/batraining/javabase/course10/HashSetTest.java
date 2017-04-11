package com.batraining.javabase.course10;

import java.util.HashSet;

/**
 * Created by pengfei on 2017/4/9.
 */
public class HashSetTest {
    public static void main(String[] args) {
        //HashSet 是不允许保存重复值，
        // 是通过hashcode 和 equals 来判断元素是否重复
        //如果2个对象的hashcode 是一样的，那么我们称之为hash冲突
        //如果HashSet出现hash冲突，会用equals方法去判断两个对象是否相等，
        // 如果相等则不进行添加，如果不重复才添加
        //为了避免hash冲突，我们尽可能要求hashcode散列（既尽可能不重复）
        HashSet set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);


        Student s1 = new Student(10,"张三");
        Student s2 = new Student(10,"张三");
        HashSet studentSet = new HashSet();
        studentSet.add(s1);
        studentSet.add(s2);
        System.out.println(studentSet);

    }
}
