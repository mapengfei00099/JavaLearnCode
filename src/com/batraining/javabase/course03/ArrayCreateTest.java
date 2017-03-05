package com.batraining.javabase.course03;


/**
 * Created by pengfei on 2016/10/15.
 */
public class ArrayCreateTest {
    public static void createArray(){
        char[] s;
        s = new char[ 26];
        for(int i= 0;i<s.length; i++) {
            s[i] = (char) ('A'+ i);
        }
        System.out.println(s);


    }
    public static void createArray1(){
        int[] s;
        s = new int[ 26];
        for(int i= 0;i<s.length; i++) {
            s[i] =  ( i);
        }
        System.out.println(s);


    }
    public static void createArray2(){
        long[] s;
        s = new long[ 26];
        for(int i= 0;i<s.length; i++) {
            s[i] =  ( i);
        }
        System.out.println(s);


    }

    public static void main(String[] args) {
        createArray();
        createArray1();
        createArray2();

    }

}
