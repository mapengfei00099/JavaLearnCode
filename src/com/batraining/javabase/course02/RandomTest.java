package com.batraining.javabase.course02;

import java.util.Arrays;
import java.util.Random;

/**
 *
 */
public class RandomTest {
    public static void main(String[] args) {
        int[] arr  = new int[10];
        for (int i : arr) {
            i =100;
        }
        System.out.println(Arrays.toString(arr));
        //随机数类
        Random random  = new Random();
    }
}
