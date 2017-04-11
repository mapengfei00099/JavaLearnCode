package com.batraining.javabase.course10;

import java.util.TreeMap;

/**
 * Created by pengfei on 2017/4/9.
 */
public class TreeMapTest {

    public static void main(String[] args) {
        //按照key进行排序
        TreeMap treeMap = new TreeMap();
        treeMap.put("b","bbbb");
        treeMap.put("a","aaaa");
        System.out.println(treeMap);
    }
}
