package com.batraining.javabase.course08;

/**
 * Created by pengfei on 2017/3/26.
 */
public class ExceptionTest1 {

    public static void main(String[] args) throws Exception  {
        //1 方法运行时可能抛出异常
        //2 throw new Exception 抛出异常，要在方法后面 写throws Exception
        //3 try{} catch(Exception e) 捕获异常(不让异常再往上层方法抛出）
        try {
            checkPassword();
        } catch (Exception e) {
            System.out.println("你的密码不正确");
        }
    }

    private static void checkPassword() throws Exception {
        String password ="123456";
        if(!password.equals("654321")){
            throw new Exception("密码不正确");
        }
    }
}
