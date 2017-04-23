package com.batraining.javabase.course12;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by pengfei on 2017/4/23.
 */
public class BufferedStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("test.txt");
        //1自带缓存区 2 实现了mark() 和reset()等功能
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);


    }
}
