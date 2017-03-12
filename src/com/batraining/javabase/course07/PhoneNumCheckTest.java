package com.batraining.javabase.course07;

import java.util.Scanner;

/**
 * Created by pengfei on 2017/3/12.
 */
public class PhoneNumCheckTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String phoneNum = null;
        while (scanner.hasNext()){
            phoneNum = scanner.next();
            //如果不用正则，1 判断是11位 2 是不是全是数字 3 是不是以 XXX 开头
            if(phoneNum.matches("^(1[358][0-9]|170|171)\\d{8}$")){
                System.out.println("你输入的是手机号码");
            }else{
                System.out.println("你输入的不是手机号码");
            }


        }
    }
}
