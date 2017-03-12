package com.batraining.javabase.course06;

/**
 * Created by pengfei on 2017/3/4.
 */
public class BlockCodeTest {

    public static final int MAX_NUM=10;
    private static int sNum = 10;
    private int num;

    static {
        System.out.println("静态代码块执行");
        sNum++;
        System.out.println(sNum);
        //System.out.println(num);错误，不能访问成员变量
    }

    {
        System.out.println("代码块执行");
        sNum++;
        num++;
        System.out.println(sNum);
        System.out.println(num);

    }

    public BlockCodeTest() {
        System.out.println("构造");
    }

    public static void main(String[] args) {
        //main方法执行前，BlockTest类先加载,所以先执行静态变量初始化和static代码块
        System.out.println("main");
        //因为BlockTest已经加载过，下面这句仅仅输出值
        System.out.println(BlockCodeTest.sNum);
        //创建对象，先执行成员变量的初始化，然后在执行普通代码块，然后执行构造
        BlockCodeTest blockCodeTest = new BlockCodeTest();
        BlockCodeTest blockCodeTest1 = new BlockCodeTest();

    }


}
