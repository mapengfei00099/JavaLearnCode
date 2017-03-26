package com.batraining.javabase.course08;

/**
 * Created by pengfei on 2017/3/26.
 */
public class InnerClassTest {
    //下面才是内部类
    //javac 之后 生成的class文件名为外部类$内部类.class,
    // 例如InnerClassTest$InnerClass.class
    public class InnerClass {

    }

    public static void main(String[] args) {

    }
}

//下面不是内部类，只是一个普通的访问修饰符位default类
class Test {

}
