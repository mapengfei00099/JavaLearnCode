package com.batraining.javabase.course12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by pengfei on 2017/4/23.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile ras= new RandomAccessFile(new File("test001.data"),
                "rw");
        System.out.println((char) ras.read());
        ras.write('b');
        ras.skipBytes(1);
        ras.write('d');
        ras.close();
    }
}
