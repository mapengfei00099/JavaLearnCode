package com.batraining.javabase.course06;

/**
 * 常量的好处：
 * 1 减少代码的修改
 * 2 能够通过常量名更好理解代码
 */
public class Circle {
    public static  final double PI = 3.1415926;
    private int width;//半径

    public Circle(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getLength(){
        return 2*PI*width;
    }

    public double area(){
        return PI*width*width;
    }

}
