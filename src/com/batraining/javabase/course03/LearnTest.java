package com.batraining.javabase.course03;

import java.util.Scanner;

/**
 *作业题
 */
public class LearnTest {
    public static void main(String[] args) {
        //question3();
        for (int i = 1; i <10 ; i++) {
            //System.out.println(i);
            for (int j = 1; j  < i; j++) {
                System.out.print(j +"*"+i +"=" +i*j + "\t");
            }
            System.out.println();
        }
    }

    private static void question3() {
        int sum =0;
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                sum= sum +i;
            }
        }
        System.out.println("合计是："+sum);
    }

    private static void question2() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double score = scanner.nextDouble();
            //int score = scanner.nextInt();
            if (score >= 90) {
                System.out.println("A级");
            } else if (score >= 80 && score < 90) {
                System.out.println("B级");
            } else if (score >= 70 && score < 80) {
                System.out.println("C级");
            } else if (score >= 60 && score < 70) {
                System.out.println("D级");
            } else if (score < 60) {
                System.out.println("E级");
            }
        }
    }

    private static void question1() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int year = scanner.nextInt();
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + "是闰年！");
            } else if (year % 400 == 0) {
                System.out.println(year + "是闰年！");
            } else {
                System.out.println(year + "不是闰年！");
            }
        }
    }
}
