package com.batraining.javabase.course08;

/**
 * Created by pengfei on 2017/3/26.
 */
public abstract class BaseAction {
    private String name;

    public abstract void doAction();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
