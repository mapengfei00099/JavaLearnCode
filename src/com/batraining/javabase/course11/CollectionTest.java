package com.batraining.javabase.course11;

import java.util.*;

/**
 * Created by pengfei on 2017/4/16.
 */
public class CollectionTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new ArrayList(10);//通过指定初始化时元素个数创建一个ArrayList
        List list4 = new ArrayList();
        list4.add(1);
        list4.add(2);
        List list2 = new ArrayList(list4);//通过另外一个Collection构造ArrayList
        Set set = new HashSet();
        Set hashSet1 = new HashSet(10);
        Set hashSet2 = new HashSet(list2);//通过另外一个Collection构造HashSet


        Map map = new HashMap();
        Map map1 = new HashMap(10);//指定初始化的时候元素个数
        Map map2 = new HashMap(10,0.8f);
        //第二个参数是负载因子，表示底层的数组占用超过0.8,就会进行扩容，默认的负载因子为0.75
        Map map3 = new HashMap(map);//通过另外一个map来构造







    }
}
