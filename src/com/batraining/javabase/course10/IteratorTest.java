package com.batraining.javabase.course10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by pengfei on 2017/4/8.
 */
public class IteratorTest {
    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add("str" + i);
        }
        Iterator iterator = arrayList.iterator();//得到一个迭代器
        while (iterator.hasNext()) {//遍历集合，检查是否存在下一个
            Object element = iterator.next();
            System.out.println("iterator = " + element);
        }


    }

}
