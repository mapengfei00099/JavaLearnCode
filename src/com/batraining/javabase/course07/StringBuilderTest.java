package com.batraining.javabase.course07;

/**
 * Created by pengfei on 2017/3/12.
 */
public class StringBuilderTest {
    public static void main(String[] args) {

        //StringBuilder底层是char[]数组
        StringBuilder sb = new StringBuilder("abc");
        //下面的append方法是对上面吃的char数组追加元素，
        // 不产生新的字符串，所以性能方面要好于String的concat方法
        sb.append("d");
        sb.append("d");

        //产生新字符串 abcd
        String result = "abc".concat("d");
        //产生新字符串abcdd
        String result1 = result.concat("d");

        //StringBuilder 转为字符串的方法
        System.out.println(sb.toString());
    }
}
