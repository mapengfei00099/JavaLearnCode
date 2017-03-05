package com.batraining.javabase.course06;

/**
 * 这是接口的实现类，
 */
public class Car implements Moveable,Cloneable {

    //这是接口中方法的具体实现
    @Override
    public void move() {
        System.out.println("每小时100公里！！！！");
    }

    @Override
    public void move1() {

    }

    public static void main(String[] args) {
        //接口也是支持多态的
        Car car  = new Car();
        Moveable car1 = car;
        Moveable  moveable1 = new Car();
        //接口也是支持instanceof 判断的
        System.out.println(car instanceof Moveable);

    }
}
