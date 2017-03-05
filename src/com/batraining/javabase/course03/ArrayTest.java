package com.batraining.javabase.course03;

import java.util.Scanner;

/**
 * Created by pengfei on 2016/10/15.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[2];

        System.arraycopy(arr1, 1, arr2, 0, 2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    public char[] createArray() {
        char[] s;
        s = new char[26];
        for (int i = 0; i < s.length; i++) {
            s[i] = (char) ('A' + i);
        }
        System.out.println(s);
        return s;
    }

    public static  int[][] add(int[][] arr1,int[][] arr2){
        //实现矩阵求和

        return null;
    }

}
