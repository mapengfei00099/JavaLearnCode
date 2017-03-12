package com.batraining.javabase.course06.homework;

import com.sun.deploy.util.Waiter;

/**
 * Created by pengfei on 2017/3/11.
 */
public class WarShip extends Weapon {
    @Override
    public void move() {

        System.out.println("WarShip move");
    }

    @Override
    public void attack() {
        System.out.println("WarShip attack");
    }
}
