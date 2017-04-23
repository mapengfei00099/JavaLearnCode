package com.batraining.javabase.course12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by pengfei on 2017/4/23.
 */
public class CaipiaoTest2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        while (list.size() < 6) {
            int randomNum = random.nextInt(16);
            if (!list.contains(randomNum)) {
                list.add(randomNum);
            }
        }
        System.out.println(list);
    }
}
