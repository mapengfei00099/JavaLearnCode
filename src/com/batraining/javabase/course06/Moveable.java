package com.batraining.javabase.course06;

/**
 * 可移动的，注意:下面是public interface XXX
 * 接口常用来定义某个标准（抽象），不进行具体的实现
 *
 */
public interface Moveable {
    int NUM =20;//public static final，接口中的变量默认情况都是常量，不推荐声明变量
    public void move();//public 可以不写，接口中的方法默认是public

    public void move1();

}
