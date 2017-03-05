package com.batraining.javabase.course02;

import java.util.Date;
import java.util.Scanner;

/** 这个类的功能是演示java的注释写法
 * 这里使用的Javadoc注释，可以使用javadoc命令生成对应的文档
 */
public class CommentExample {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        /*多行注释
         */
        Scanner scanner = new Scanner(System.in);
        //单行注释
        while (true){
        int num = scanner.nextInt();
        System.out.println("你输入的是：" +num);
        }
    }

}
