package com.batraining.javabase.course09;

import java.util.Scanner;

/**
 * Created by pengfei on 2017/3/29.
 */
public class EmailExceptionTest {

    public static void  checkEmail(String email) throws  EmailException{
        {

                if(!email.matches("^\\w{5,}@[A-Za-z0-9]{2,}\\.(com|net|cn)$")){
                  throw  new EmailException("邮件地址不合法！");
                }
        }

    }

    public static void main(String[] args) {
        try {
            checkEmail("13213123");
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}
