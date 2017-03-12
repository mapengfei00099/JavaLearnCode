package com.batraining.javabase.course07;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Created by pengfei on 2017/3/12.
 */
public class NumberFormatTest {
    public static void main(String[] args) {
        //处理数字的转换
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        //设置小数部分的最大位数
        numberFormat.setMaximumFractionDigits(2);
        //数字转为字符串
        String numberStr = numberFormat.format(12.525);
        System.out.println(numberStr);//12.53 四舍五入
        try {
            //字符串转为数字，但是推荐使用包装类的parseXXX,例如Float.parseFloat(3)
            Number number = numberFormat.parse("12.53");
           float abc= number.floatValue();
            System.out.println(abc);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //百分数转换
        NumberFormat percentNumberFormat = NumberFormat.getPercentInstance();
        percentNumberFormat.setMaximumFractionDigits(2);
        //数字转为百分数
        String percentStr = percentNumberFormat.format(0.0512321);
        System.out.println(percentStr);
        try {
            //百分数转为数字
            Number number = percentNumberFormat.parse("12.53%");
            System.out.println(number.doubleValue());
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
