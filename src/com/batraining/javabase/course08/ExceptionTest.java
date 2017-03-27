package com.batraining.javabase.course08;

/**异常
 * Created by pengfei on 2017/3/26.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        //System.out.println(1/0);//ArithmeticException
        //String a = null;
        //System.out.println(a.toString());//NullPointerException
        int[] arr = new int[3];
        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException

    }
}
