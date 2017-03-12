package com.batraining.javabase.course07;

import java.util.Arrays;

/**
 * 1String 不可变字符串，
 * StringBuffer,StringBuilder是可变字符串，
 * 其中StringBuffer是线程安全的；
 * 大量字符串的拼接最好使用StringBuffer类或者StringBuilder
 * 2 + 字符串拼接是通过StringBuilder（StringBuffer）的append方法实现的；
 * 3 String使用的是UTF-16编码的字符串
 *
 */
public class StringTest {
    public static void main(String[] args) {
       // String类的构造和方法是不能传null的,否则会抛出NullPointException
       //String a1 = new String(null);
        //String 可以通过字符数组构造
        char[] charArr = new char[]{'a','b','c'};
        String abc = new String(charArr);
        System.out.println(abc.length());//3
        //String还支持unicode code point，例如常见的表情就是unicode code point
        //获取index位置的字符
        char a = abc.charAt(0);
        System.out.println(a);
        //字符串拼接
        String b="你好，你好";
        String c = "朋友";
        System.out.println(b.concat(c));
        //获取字符或者字符串的第一个位置
        System.out.println(b.indexOf("好"));//1
        //获取字符或者字符串的最后一个位置
        System.out.println(b.lastIndexOf("好"));
        //字符串替换
        System.out.println(b.replace("你","您"));
        //字符串拆分，split方法，返回为字符串的数组
        String d = "1:2:3";
        System.out.println(Arrays.toString(d.split(":")));
        //字符串是否以XXX开头或结尾
        System.out.println(d.startsWith("1"));
        System.out.println(d.endsWith("1"));

        //将字符分别转换为大写和小写
        System.out.println("abc".toUpperCase());//ABC
        System.out.println("aBC".toLowerCase());//abc
        //去掉字符串前后的空白
        System.out.println(" fda afd ".trim());//fda afd
        //截取字符串，不包含后面的索引位的字符
        System.out.println("abc".substring(0,2));//ab
        //格式化字符串（含参数替换,类似于C语言的printf）
        System.out.println(String.format("%s 你的成绩是 %d","小张",12));
        //字符串比较是否相同，使用equals
        System.out.println("abc".equals("abcd"));//false




    }
}
