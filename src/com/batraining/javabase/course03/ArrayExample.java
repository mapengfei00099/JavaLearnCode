package com.batraining.javabase.course03;


import java.util.Arrays;
import java.util.Random;

/**
 *
 */
public class ArrayExample {
    public static void main(String[] args) {
         int[][] arr= new int[4][3];
        for (int i = 0; i < arr.length; i++) {
             // arr[i] = new int[3];
            int[] tempArr = arr[i];
            for (int j = 0; j < tempArr.length; j++) {
                tempArr[j] =(int)(Math.random()*100);
                System.out.println(arr[i][j]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int[][] arrb = new int[][]{{1},{2},{3}};
        System.out.println(arrb.length);
        System.out.println(arrb[0].length);

    }

    private static void question4() {
        int[] arr = new int[40];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        printArr(arr);
        int temp=0;
        //冒泡排序(升序)
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length -1-i; j++) {
                if(arr[j]>arr[j+1]){
                     temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        printArr(arr);
        //冒泡排序（降序)
        for (int i = arr.length-1;i>0;i--){
            for (int j =0 ; j <i ; j++) {

                if(arr[j]<arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] =temp;
                }

            }
        }

        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int temp: arr) {
            System.out.print(temp+"\t");
        }
        System.out.println();
    }

    private static void questionc2() {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int temp = arr[0];
        for (int i = 0; i <arr.length-1; i++) {

            arr[i] = arr[i+1];

        }
        arr[9] = temp;


        for (int tmpElement: arr) {
            System.out.print(tmpElement +"\t");
        }
    }

    private static void questionc1() {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.println("第" + (i+1) + "个元素是：" + arr[i]);
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum =sum +  arr[i];
        }

        System.out.println("总和：" +sum);

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值：" +max);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("最小值:" + min);

        System.out.println("平均值：" + (sum*1.0/arr.length));
    }

    private static void question2() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temp = array[0];
        int i = 0;
        while (i < 9) {
            array[i] = array[i + 1];
            i++;
        }
        array[i] = temp;
        i = 0;
        while (i < 10) {
            System.out.println(array[i]);
            i++;
        }
    }

    private static void question1() {
        int[] intArr = new int[10];
        Random random = new Random();
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = random.nextInt(100);
            System.out.println("第" + (i + 1) + "个数是：" + intArr[i]);
        }
        int sum = getSum(intArr);
        int max = getMax(intArr);
        int min = getMin(intArr);
        int avg = sum / intArr.length;
        System.out.println("总和：" + sum);
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        System.out.println("平均值：" + avg);
    }

    private static int getMin(int[] intArr) {
        int min = intArr[0];
        for (int i : intArr) {

            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private static int getMax(int[] intArr) {
        int max = intArr[0];
        for (int i : intArr) {

            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static int getSum(int[] intArr) {
        int sum = 0;
        for (int i : intArr) {
            sum += i;
        }
        return sum;
    }

    public void sort(int[] a) {
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
