package com.batraining.javabase.course11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by pengfei on 2017/4/16.
 */
public class ReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
             fr = new FileReader(new File("C:\\Users\\pengfei\\Desktop\\新建文本文档.txt"));
            int c = 0;
           while ((c= fr.read())!=-1){
               char temp  = (char)c;
               System.out.print(temp);
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
