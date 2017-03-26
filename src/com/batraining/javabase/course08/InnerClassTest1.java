package com.batraining.javabase.course08;

/**
 * Created by pengfei on 2017/3/26.
 */
public class InnerClassTest1 {
    private int x;

    public void test() {
        final int z = 100;
        //局部内部类只能定义在方法里面
        //局部内部类不能被public，protected，private访问修饰符修饰，
        // 它只能是default修饰符

        class Inner {
            //和成员内部类一样不能定义静态变量和方法
            //public static int num=100;
            private int x;
            private int y;

            public void test() {
                //和成员内部类一样可以访问外部类的成员变量和方法
                x = 10;
                InnerClassTest1.this.x = 10;
                //它还可以访问当前方法的final变量或者参数
                System.out.println(z);
            }

        }
        //局部内部类只能在当前方法中使用
        Inner inner = new Inner();

    }

}
