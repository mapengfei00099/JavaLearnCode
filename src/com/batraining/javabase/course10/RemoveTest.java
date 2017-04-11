package com.batraining.javabase.course10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by pengfei on 2017/4/9.
 */
public class RemoveTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add("str" + i);
        }
        //迭代器的remove 是可以进行循环删除，

       Iterator iterator2 = arrayList.iterator();
        while (iterator2.hasNext()) {//移除元素
            Object element = iterator2.next();
            System.out.println("remove之前: " + element);
            iterator2.remove();
        }
        System.out.println(arrayList);
        // 而ArrayList 的remove 进行循环删除，注意结果与预期会不一样
       /* for (int i = 0; i < arrayList.size(); i++) {
           arrayList.remove(i);
        }
        System.out.println(arrayList);*/
    }
}
