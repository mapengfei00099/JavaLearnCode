package com.batraining.javabase.course08;

/**
 * 成员内部类
 * Created by pengfei on 2017/3/26.
 */
public class Outer {
    private int x;
    private int z;

    //这里的内部类是一个成员内部类，可以理解为于一个成员类；
    //四个访问修饰符都是可以修饰成员内部类
    public class Inner {
        private int x;
        private int y;
        //成员内部类中不能定义静态变量或者方法，而只能定义实例成员
        /*static void printDate(){

        }*/

        public void test() {
            z = 10;//访问外部类的成员变量z
            x = 10;
            this.x = 20;
            //内部类是可以访问外部的属性或者方法
            //访问外部类属性或者方法的方式
            //成员内部类的实例自动持有外部类的实例的引用,也就是下面的this
            Outer.this.x = 10;
        }
    }

    public void test1() {
        //外部类不能访问内部类的成员
        //y = 10; 错误
    }

    //外部类中定义内部类的成员变量
    private Inner inner;

    public static void main(String[] args) {
        Outer outer = new Outer();
        //在创建成员内部类的实例时，外部类的实例必须存在
        Outer.Inner inner = outer.new Inner();
        Outer.Inner inner1 = outer.new Inner();


    }
}
