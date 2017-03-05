package com.batraining.javabase.course03;

/**
 *
 */
public class MethodExample {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    public static void addAge(int[] a){
        a[0]++;
        System.out.println("a="+a[0]);
    }

    public static int sum(int n){
       int result =0;
        if (n==0){
            result = 0;
        }
        if (n>0){
        result = sum(n-1) +n;
        }
        return  result;
    }


}
