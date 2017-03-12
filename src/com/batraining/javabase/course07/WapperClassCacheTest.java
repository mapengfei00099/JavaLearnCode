package com.batraining.javabase.course07;

/**
 * 包装类的缓存问题
 */
public class WapperClassCacheTest {
    public static void main(String[] args) {
        //引用数据类型，任何情况下的对象比较都使用equals方法，==永远都是内存地址的比较

        //对于Integer类型，会缓存-128-127的对象，那么调用valueOf 返回的是缓存的同一个对象
        //其他类型的包装类也有缓存，但是缓存的值得范围可能不一致

        Integer i1= 10;//自动调用valueOf方法
        Integer i2= 10;//自动调用valueOf方法
        System.out.println(i1==i2);//按照正常情况这里应该是false，但是因为缓存的原因是true
        System.out.println(i1.equals(i2));//true


        Integer i3= 130;//自动调用valueOf方法
        Integer i4= 130;//自动调用valueOf方法
        System.out.println(i3==i4);

        //下面代码不走cache代码，所以输出是false
        Integer i5= new Integer(10);
        Integer i6 = new Integer(10);
        System.out.println(i5==i6);


    }
}
