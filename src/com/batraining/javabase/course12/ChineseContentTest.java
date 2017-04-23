package com.batraining.javabase.course12;








import java.io.*;
import java.util.Arrays;

/**
 * Created by pengfei on 2017/4/23.
 */
public class ChineseContentTest {

    public static void main(String[] args) throws IOException {
        //readChinese1();
        readChinese2();
    }
    private static void readChinese2()throws  IOException{
        FileInputStream inputStream = new FileInputStream(new File("GBK.txt"));
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"GBK");
        char[] buffer = new char[512];
        while (inputStreamReader.read(buffer)!=-1){
            System.out.println(new String(buffer));
        }
        inputStreamReader.close();
        inputStream.close();


    }

    private static void readChinese1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("GBK.txt"));
        byte[] buffer= new byte[512];
        while (fileInputStream.read(buffer)!=-1){
            System.out.println(new String(buffer,"GBK"));
        }
        fileInputStream.close();
    }
}


