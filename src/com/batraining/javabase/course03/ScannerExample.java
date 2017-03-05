package com.batraining.javabase.course03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * 读取控制台的输入
 */
public class ScannerExample {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        print(a);
        for (String arg : args) {
            System.out.println(arg);
        }
        InputStream inputStream = new FileInputStream("11");


    }

    private static void print(int a) {
        System.out.println("你输入的是：" +a);
    }
}
