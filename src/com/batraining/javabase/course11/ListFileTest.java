package com.batraining.javabase.course11;

import java.io.File;

/**
 * Created by pengfei on 2017/4/16.
 */
public class ListFileTest {
    public static void main(String[] args) {
        listDir("D:\\");
    }

    public static void listDir(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isFile()) {
                    System.out.println(file1.getAbsolutePath());
                } else {
                    System.out.println(file.getAbsolutePath());
                    listDir(file1.getAbsolutePath());
                }
            }
        }

    }
}
