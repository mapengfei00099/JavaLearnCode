package com.batraining.javabase.course11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by pengfei on 2017/4/16.
 */
public class RemoveDuplicateTest {
    public static void main(String[] args) {
        int[] arr = new int[]{10,12,10,11,12,16,15};
        //去重，顺序不变
        ArrayList arrayList = new ArrayList();
        for (int i : arr) {
            if(!arrayList.contains(i)){
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);

        List list = new ArrayList();
        for (int i : arr) {
            list.add(i);
        }
        Set set= new HashSet(list);
        System.out.println(set);

    }
}
