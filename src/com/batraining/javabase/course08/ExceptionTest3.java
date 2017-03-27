package com.batraining.javabase.course08;

import java.io.*;

/**
 * 异常的多态：
 * Created by pengfei on 2017/3/26.
 */
public class ExceptionTest3 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("s:\\aaa.txt");
        } catch (IOException e) {
            System.out.println("1");
            //异常的捕获支持多态，上面的代码本身抛出FileNotFoundException，
            // 是IOException的子类，这里也可以使用IOException 进行捕获
            e.printStackTrace();
        } catch (Exception e) {
            //异常只能被捕获一次，所以这里不会被执行
            System.out.println("2");
            e.printStackTrace();
        }
        //异常的捕获顺序：范围小的异常先捕获，
        // 范围大的异常后捕获，否则编译不通过


    }
}
