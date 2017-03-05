package com.batraining.javabase.course02;

import sun.misc.FloatingDecimal;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;

/**
 *
 */
public class MyHelloWorld {
    public static void main(String[] args){
        System.out.println("hello World");
        System.out.println(0.99999999f==1.0f);
        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toBinaryString(Float.floatToIntBits(0.2f)));
        System.out.println(Float.floatToIntBits(0.99999999f));
        System.out.println(Integer.toBinaryString(Float.floatToIntBits(0.99999999f
        )));

        System.out.println(Integer.toBinaryString(Float.floatToIntBits(1.0f
        )));
        BigDecimal bigDecimal = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("0.09");
        System.out.println(5.34375f);
        System.out.println(Float.floatToIntBits(0.3f));
        System.out.println(Integer.toBinaryString(Float.floatToIntBits(0.2f)));
        System.out.println(Integer.toBinaryString(119));
        int x = (int) 12.1 + (byte)7.9;
        double y = x + (double) 10  + 1;
        System.out.println(y);
        char a = 'a';
        System.out.println((char)(a+2));

    }
}
