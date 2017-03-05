package com.batraining.javabase.course06;

/**
 * Created by pengfei on 2017/3/5.
 */
public class A {
    public static final int MAX_USER_ONLINE  =10;
    public static int num = 0;
    //下面是静态代码块
    static {
        num++;
        System.out.println(num);
    }

    public static void test(){
        //静态方法里只能范文静态变量，不能访问成员变量
        num++;
    }

    public static void main(String[] args) {

    }
}
