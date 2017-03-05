package com.batraining.javabase.course03;

import java.util.Scanner;

/**
 * Created by pengfei on 2016/10/15.
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        switch (c) {
            case 'a':
                System.out.println("");
                break;
            case 'b':
                System.out.println("");
                break;
            case 'c':
                System.out.println("");
                break;
            default:
                System.out.println("input error!");

        }
    }
}
