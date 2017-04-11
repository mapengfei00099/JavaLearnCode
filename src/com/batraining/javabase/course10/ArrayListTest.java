package com.batraining.javabase.course10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by pengfei on 2017/4/9.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //实例化
        ArrayList arrayList =new ArrayList();

        //使用Collection接口声明的增加删除方法
        arrayList.add(1);//增加元素
        arrayList.add(2);
        arrayList.remove((Object) 1);
        //使用Collection接口声明的查询方法
        System.out.println(arrayList.size());//获取集合的元素个数
        System.out.println(arrayList.isEmpty());//判断集合是否为空
        System.out.println(arrayList.contains(0));//判断是否存在某个元素
        //使用Collection接口声明的迭代器
        Iterator iterator = arrayList.iterator();//获取集合的迭代器
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //使用Collection接口声明的转为数组
        System.out.println(Arrays.toString(arrayList.toArray()));

        //使用Collection声明的对另外一个集合的操作
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(5);
        arrayList.addAll(arrayList1);//将arrayList1 的数据增加到arrayList中
        System.out.println(arrayList);
        arrayList.retainAll(arrayList1);//获取集合之间的交集：例如arrayList1和arrayList的交集
        System.out.println("retainAll" + arrayList);

        //使用List接口上扩展的方法(主要是通过index来处理数据）
        arrayList.add(1,3);//在index位置插入元素
        arrayList.get(1);//获取index 位置的元素
        System.out.println(arrayList.indexOf(2));//获取 元素的位置
        arrayList.remove(1);//删除index 为1 的元素
        System.out.println(arrayList.lastIndexOf(2));//获取元素的最后一个索引位置






    }
}
