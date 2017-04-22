package com.batraining.javabase.course11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by pengfei on 2017/4/16.
 */
public class CollectionsExample {
    public static void main(String[] args) {
        //Collections是一个工具类，注意与集合的接口Collection注意区分，
        // 主要功能是提供Collection相关的一些工具方法
        //同理还有之前学过的Arrays工具类
        List list = new ArrayList();
        list.add(2);
        list.add(1);
        list.add(-9);
        Collections.sort(list);//对List排序
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,2));//进行二分查找
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.reverse(list);//反转Collection
        System.out.println(list);
        List list3 = Collections.unmodifiableList(list);//获取不可变的集合(不可以进行修改）
        //list3.add(1);//抛出异常UnsupportedOperationException

        List list4 =  Collections.nCopies(10,'a');//n次复制
        System.out.println(list4);

    }
}
