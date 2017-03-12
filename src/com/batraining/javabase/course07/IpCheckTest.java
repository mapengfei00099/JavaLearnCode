package com.batraining.javabase.course07;

import java.util.Scanner;

/**
 * Created by pengfei on 2017/3/12.
 */
public class IpCheckTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String ip = null;
        while (scanner.hasNext()){
            ip = scanner.next();
            // 遗留问题ip的正则表达式
            if(ip.matches("^[1-9]\\d{0,2}\\.\\d{1,3}\\.\\d{1,3}.\\d{1,3}$")){
                System.out.println("你输入的是IP地址");
            }else{
                System.out.println("你输入的不是IP地址");
            }


        }
    }
}
