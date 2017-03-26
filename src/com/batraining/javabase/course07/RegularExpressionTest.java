package com.batraining.javabase.course07;

/**
 *
 * ^ 代表字符串的开头
 * $ 代表字符串的结尾
 * [] 字符范围
 * [0-9] 代表[0123456789]
 * [a-z] 代表小写的26个字母
 * [A-Z] 代表大写的26个字母
 *
 * {}次数范围，既重复的次数
 * X{3}       代表X 3次
 * X?         X之多一次
 * X*         X 0次或者多次
 * X+         X 至少一次
 * X{n}       X n次
 * X{n,}      X 至少n次
 * X{n,m}     X 至少n次，之多m次
 * 预定义的字符如下：
 * .         代表任何字符
 * \d        代表0-9的字符
 * \D        代表非0-9的字符
 * \w        代表[a-zA-Z0-9_]的字符
 * \W        代表非\w的字符
 * \s        代表空白字符
 *
 *
 */
public class RegularExpressionTest {
    public static void main(String[] args) {
        String a="123abc";
        if(a.matches("^\\d{3}\\w{3}$")){
            System.out.println("你给的字符是匹配的");
        }
        String b = "1.2.3.4.5";
        //.是正则表达式，下面的拆分会有问题,通常在其前面加\\来屏蔽他的正则属性
        String[] subArr = b.split("\\.");
        for (String temp : subArr) {
            System.out.println(temp);
        }


    }

}
