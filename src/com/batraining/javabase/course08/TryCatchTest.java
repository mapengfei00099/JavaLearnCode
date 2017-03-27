package com.batraining.javabase.course08;

import java.io.File;
import java.io.IOException;

/**
 * Created by pengfei on 2017/3/26.
 */
public class TryCatchTest {
    public static void main(String[] args) {
        //try catch 目的：捕获异常（并不是所有Exception都要抛出给JVM,
        // 程序要对一些异常根据系统的设计等因素要进行捕获）
        File file = new File("S:\\test.txt");

        System.out.println("1");
        try {
            System.out.println("2");
            file.createNewFile();

            //抛出异常以后后续的代码就不在继续执行
            System.out.println("3");
            test();

        } catch (IOException e) {
            //catch 里的代码只有抛出异常并根据类型捕获到异常才会执行
            System.out.println("4");
            //这里可以拿到IOException对象
            System.out.println(e.getMessage());
           e.printStackTrace();//打印程序的调用过程,
            // 通过System.err.println输出的，也就是按照错误信息输出
        } catch (BatException e) {
            //多个异常的捕获
            e.printStackTrace();
        } finally {
            //无论是否抛出异常都要执行的逻辑，
            // 常用用在IO流，网络流等其他资源的回收处理
            System.out.println("6");
        }
        System.out.println("5");

    }
    public static void test() throws  BatException{
        throw new  BatException("缺考",101,"Java" +
                "");
    }
}
