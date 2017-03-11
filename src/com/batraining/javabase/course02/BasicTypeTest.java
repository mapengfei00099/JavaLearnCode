package com.batraining.javabase.course02;


import java.math.BigDecimal;

/**基本数据类型
 * 类型名    占用字节数      值范围
 * boolean      1           true、false
 * byte         1           -128-127
 * short        2           -32768-32767
 * int          4           -14亿-14亿
 * long         8
 * float        4
 * double       8
 * char         2         0-65535(使用unicode编码)
 *
 * 注意：char 和String的区别
 *
 */
public class BasicTypeTest {
    public static void main(String[] args){
        System.out.println("hello World");
        System.out.println(0.99999999f==1.0f);//true，注意浮点型数据的二进制表示
        System.out.println(Integer.toBinaryString(8));//查看二进制数据
        System.out.println(Integer.toBinaryString(Float.floatToIntBits(0.2f)));
        System.out.println(Float.floatToIntBits(0.99999999f));
        System.out.println(Integer.toBinaryString(Float.floatToIntBits(0.99999999f
        )));

        System.out.println(Integer.toBinaryString(Float.floatToIntBits(1.0f
        )));

        //精确的浮点型运算一般使用BigDecimal类
        BigDecimal bigDecimal = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("0.09");
        System.out.println(5.34375f);
        System.out.println(Float.floatToIntBits(0.3f));
        System.out.println(Integer.toBinaryString(Float.floatToIntBits(0.2f)));
        System.out.println(Integer.toBinaryString(119));
        //强制类型转换会产生精度问题
        int x = (int) 12.1 + (byte)7.9;//x=19
        double y = x + (double) 10  + 1; //y=30
        System.out.println(y);//输出30

        char a = 'a';
        System.out.println((char)(a+2));//强制转为char型，输出'c'

    }
}
