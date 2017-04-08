package com.batraining.javabase.course09;

import java.util.Arrays;

public class Test {
    String o = "";

    public static void main(String[] args) {
        String[ ] colors =
                 			{"blue","red","green","yellow","orange"};
         			Arrays.sort(colors);
        			int s2 = Arrays.binarySearch(colors, "orange");
        			int s3 = Arrays.binarySearch(colors, "violet");
         			System.out.print(s2 + "" + s3);


    }
}
