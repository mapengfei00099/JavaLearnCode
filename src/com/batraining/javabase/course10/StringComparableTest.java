package com.batraining.javabase.course10;

/**
 * Created by pengfei on 2017/4/9.
 */
public class StringComparableTest {
    public static void main(String[] args) {
        //String 的compareTo的规则
        String str1= "abc";
        String str2 = "abd";
        System.out.println(str1.compareTo(str2));

        String str3= "add";
        String str4 = "bab";
        System.out.println(str3.compareTo(str4));
        String str5 = "ad";
        System.out.println(str3.compareTo(str5));
    }
}
