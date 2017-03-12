package com.batraining.javabase.course06;


/**
 * Integer包装类的使用
 */
public class IntegerTest {
    public static void main(String[] args) {
        //引用数据类型，除了new XXX创建实例，还可以通过基本数据类型自动转换
        Integer i1 = 10;//自动装箱
        Integer i2 = new Integer(10);
        int i3 = i2;//自动拆箱
        Integer i4 = null;//基本数据类型不具备的null可以赋值给包装类
        //包装类和对应的基本数据类型做比对，那么会自动转换对应的基本数据类型做对应
        System.out.println(i1 == 10);
        //i3的定义是int类型，那么会自动转为int 进行值得比较
        System.out.println(i1 == i3);
        Integer i5 = new Integer(10);
        //i1和i5都是引用数据类型，== 是通过内存地址的比对，所以为false
        System.out.println(i1 == i5);//false
        //引用数据类型判断值是否相等是用equals
        System.out.println(i1.equals(i5));


        //工具方法：进制转换，如下的10进制转换成2进制
        System.out.println(Integer.toString(10, 2));
        //工具方法：10进制数据转换为16进制的数据
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toString(19999));

        //重点：字符串转为int
        System.out.println(Integer.parseInt("12222"));
        //System.out.println(Integer.parseInt("a"));这句会抛出异常，因为a转不成int

        //valueOf：讲对应的参数转为Integer
        System.out.println(Integer.valueOf("12222"));
        System.out.println(Integer.valueOf(11));

        //向其他类型转换
        System.out.println(i1.byteValue());
        System.out.println(i1.shortValue());
        System.out.println(i1.longValue());
        System.out.println(i1.floatValue());
        System.out.println(i1.doubleValue());


    }
}
