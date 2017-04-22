package com.batraining.javabase.course11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengfei on 2017/4/16.
 */
public class ArrayListInitialCapacityTest {
    public static void main(String[] args) {
        List list = new ArrayList(80000000);
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 80000000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end-begin));
    }
}
