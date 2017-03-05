package com.batraining.javabase.course06;

import java.util.Objects;

/**
 * Created by pengfei on 2017/3/5.
 */
public class Rectangle {
    private int x;

    public Rectangle(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "x="+x;
    }

    public static void main(String[] args) {
        Rectangle object =new Rectangle(1);

        Rectangle object1 = new Rectangle(1);
        System.out.println(object.equals(object1));
        String a = "" + object1;//对象和字符串做拼接，默认调用了toString 方法
        System.out.println(a);
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Rectangle){
            Rectangle rectangle =(Rectangle)obj;
            return this.x ==rectangle.x;
        }else{
            return false;
        }

    }
}
