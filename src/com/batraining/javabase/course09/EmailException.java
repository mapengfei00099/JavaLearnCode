package com.batraining.javabase.course09;

/**
 * Created by pengfei on 2017/3/29.
 */
public class EmailException extends Exception {
     EmailException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "EmailException{}";
    }
}
