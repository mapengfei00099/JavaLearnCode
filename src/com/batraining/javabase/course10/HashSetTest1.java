package com.batraining.javabase.course10;

import java.util.HashSet;

/**
 * "abcdeffdaskfdafd" 获取 所有的不重复字符
 *
 *
 * Created by pengfei on 2017/4/9.
 */
public class HashSetTest1 {
    public static void main(String[] args) {
        String a = "abcdeffdaskfdafd";
        char[] arr = a.toCharArray();
        HashSet set = new HashSet();
        for (char c : arr) {
            set.add(c);
        }
        System.out.println(set);
    }
}
