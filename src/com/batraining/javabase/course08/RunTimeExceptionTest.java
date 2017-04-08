package com.batraining.javabase.course08;

/**RunTimeException 是运行时异常（未检查异常:unchecked Exception）,
 * 也就是说这种异常的状况在编译时不可预知，在运行时才有可能发生
 * NullPointException,ArrayIndexOutOfBoundsException,ClassException
 * 等都是RunTimeException的子类
 * 通常RunTimeException都是程序本身的一些错误；
 *
 * 而非RunTimeException的异常是已检查异常（checked Exception），
 * FileNotFoundException，IOException等，主要解决非程序的错误，
 * 比如：网络错误，磁盘损害等外部因数引起的异常；
 * 已检查异常：就是说抛出异常，让调用者必须在编译时进行异常
 * 可能出现时的处理；
 *
 *
 *日常开发中定义以及使用RunTimeException 的比较多
 *
 */
public class RunTimeExceptionTest {
    public static void main(String[] args)   {
        //抛出RunTimeException，可以省去在方法上写throws XXXException
        throw new NullPointerException();

    }
}
