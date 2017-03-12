package com.batraining.javabase.course06.homework;

/**
 * Created by pengfei on 2017/3/11.
 */
public class Tank extends Weapon {
    @Override
    public void move() {
        System.out.println("tank move");
    }

    @Override
    public void attack() {
        System.out.println("tank attack");
    }
}
