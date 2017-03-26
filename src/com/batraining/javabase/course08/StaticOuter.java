package com.batraining.javabase.course08;

/**
 * 静态内部类
 * Created by pengfei on 2017/3/26.
 */
public class StaticOuter {
    public static int num = 100;
    private int x;
    private int y;

    public static class StaticInner {
        //静态内部类的实例不会自动持有外部类的特定实例的引用，
        // 在创建内部类的实例时，不必创建外部类的实例。
        //StaticOuter.this. 错误
        public void test() {
            //静态内部类可以访问外部类的静态变量，不能直接访问外部类成员变量和方法
            StaticOuter.num++;
            //可以通过创建外部类的实例，来访问其成员变量和方法
            StaticOuter outer = new StaticOuter();
            outer.x = 100;

        }

        //在静态内部类里可以定义静态成员和实例成员
        private static int count = 100;
        private int y;


    }

    public static void main(String[] args) {
        //通过完整的类名可以访问静态内部类
        StaticInner staticInner = new StaticOuter.StaticInner();
        System.out.println(StaticInner.count);
    }

}
