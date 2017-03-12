package com.batraining.javabase.course07;

/**
 * Created by pengfei on 2017/3/12.
 */
public class LongTest {

    public static void main(String[] args) {
        //1将 字符串50 转成long，Long
        //2 将上面的Long 型转换int
        long var1= Long.parseLong("50");//parseXX：获取字符串对应的基本数据类型
        Long var2= Long.valueOf("50");//valueOf：获取字符串对应的包装类
        int  var3 = var2.intValue();//xxxValue 获取对应包装类的其他基本数据类型的值


        //包装类支持null，但是null不能转换为基本数据类型，如果强行转换，会抛出NullPointException
        Long var4= null;
        System.out.println(var4==0L);




    }
}
