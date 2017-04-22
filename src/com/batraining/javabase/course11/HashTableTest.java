package com.batraining.javabase.course11;

import java.util.Hashtable;

/**
 * Created by pengfei on 2017/4/16.
 */
public class HashTableTest {
    public static void main(String[] args) {
        //Hashtable和HashMap类似，都可以存储key-value结构的数据，
        // 1但是Hashtable的方法基本上都增加了synchronized关键字，来实现线程安全的处理，
        // 而HashMap是线程不安全的
        // 2 Hashtable是不允许key 为null的，HashMap 是支持的
        Hashtable hashtable = new Hashtable();
        hashtable.put(null,null);//会抛出NullPointException异常
    }
}
