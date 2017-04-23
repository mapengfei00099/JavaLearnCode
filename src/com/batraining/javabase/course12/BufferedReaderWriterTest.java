package com.batraining.javabase.course12;

import java.io.*;

/**
 * Created by pengfei on 2017/4/23.
 */
public class BufferedReaderWriterTest {
    public static void main(String[] args) throws IOException {
       // exampleBufferedReader();
        FileWriter fileWriter = new FileWriter("test.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

    }

    private static void exampleBufferedReader() throws IOException {
        FileReader fr = new FileReader("test.txt");
        //Buffered 带有缓冲区的类，另外这个类的readLine方法很有用
        BufferedReader bfr = new BufferedReader(fr);
        String temp =null;
        while ((temp=bfr.readLine())!=null){
            System.out.println(temp);
        }

        bfr.close();
        fr.close();
    }
}

