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
                //移动号段 134-139,147,150,151,152,157,158,159,182,187,188
                //联通号段 130,131,132,155,156,185,186
                //电信号段 133,153,180,181,189
                if(phoneNum.matches("^(13[4-9]|147|15[012789]|18[278])\\d{8}$")){
                    System.out.println("你输入的是移动手机号码");
                }

                if(phoneNum.matches("^(13[0-2]|15[56]|18[56])\\d{8}$")){
                    System.out.println("你输入的是联通手机号码");
                }
                if(phoneNum.matches("^(133|153|18[019])\\d{8}$")){
                    System.out.println("你输入的是电信手机号码");
                }


            }else{
                System.out.println("你输入的不是手机号码");
            }





        }
    }
}
