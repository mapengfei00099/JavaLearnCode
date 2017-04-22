package com.batraining.javabase.course11;

import java.util.*;

public class GenTypeTest {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        sort(list);
        Map<String,Integer> map = new HashMap<String,Integer>();
        //key 的类型为String，Value的类型为Integer
        map.put("1",2);
       Set<String> keyset= map.keySet();
       Collection<Integer> values = map.values();
       //注意这里的泛型参数
       Set<Map.Entry<String,Integer>> entrySet =  map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {

            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        ArrayList<Number> a1 = new ArrayList<Number>(10);
       a1.add(10.2f);
       a1.add(10);
       A<String> a = new A<String>();
       a.print("fdasfdas");
       List<String> list4 = new ArrayList<String>();
       list4.add("112");
        for (String s : list4) {

        }
        List<Map<String,Object>> list5 = new ArrayList<Map<String,Object>>();


    }
    public static void sort(List<Integer> list){


    }
}
