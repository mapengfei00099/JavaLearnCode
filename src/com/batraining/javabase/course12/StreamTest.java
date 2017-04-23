package com.batraining.javabase.course12;

import java.io.*;
import java.util.Scanner;

/**
 * Created by pengfei on 2017/4/23.
 */
public class StreamTest {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = null;
        while ((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }

    }
}
