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
            //0-255 分成 0-99,100-199,200-249,250-255
            //\d{1,2},1\d{2},2[0-4][0-9],25[0-5]
            if(ip.matches("^((\\d{1,2}|1\\d{2}|2[0-4][0-9]|25[0-5])\\.){3}(\\d{1,2}|1\\d{2}|2[0-4][0-9]|25[0-5])$")){
                System.out.println("你输入的是IP地址");
            }else{
                System.out.println("你输入的不是IP地址");
            }


        }
    }
}
