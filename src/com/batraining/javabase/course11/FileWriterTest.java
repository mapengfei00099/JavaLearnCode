package com.batraining.javabase.course11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by pengfei on 2017/4/16.
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(new File("D:\\aaaa.txt"));
            fw.write("fdsakfjdklsjglskajffdfdsafdsafa");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
