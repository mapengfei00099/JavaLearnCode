package com.batraining.javabase.course07.homework;

import java.util.Scanner;

/**
 * Created by pengfei on 2017/3/26.
 */
public class EmailCheckUtil {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String email = null;
        while (scanner.hasNext()){
            email = scanner.next();
            if(email.matches("^\\w{5,}@[A-Za-z0-9]{2,}\\.(com|net|cn)$")){
                System.out.println("你输入的是email");
            }else{
                System.out.println("你输入的不是email");
            }


        }
    }
}
