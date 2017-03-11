package com.batraining.javabase.course06.subpackage;

import com.batraining.javabase.course06.A;

/**
 *
 */
public class B {
    public static void main(String[] args) {
        System.out.println("main");//首先执行这句，然后才执行下一句的A类的加载
        A.test();//A类加载，A类的的静态变量初始化,静态代码块执行
        A.test();//第二次调用不加载类，
        System.out.println(A.num);
        A a = new A();
        a.num++; //相当于A.num++
    }
}
