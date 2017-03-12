package com.batraining.javabase.course07;

import java.util.Arrays;

/**
 * 1假如有下面是一个班级的考试信息（字符串），请计算平均分
 201301011;小李;87;
 201401012;小王;96;
 201301013;小李;77;
 201401014;小王;56;
 201301015;小李;87;
 201401016;小王;16;
 */
public class StudentScore {
    public static void main(String[] args) {
        String data = "201301011;小李;87;\n" +
                "201401012;小王;96;\n" +
                "201301013;小李;77;\n" +
                "201401014;小王;56;\n" +
                "201301015;小李;87;\n" +
                "201401016;小王;16;\n";
        System.out.println(data);
        String[]  arr1 = data.split("\n");
        System.out.println("学生人数:" +arr1.length);
        int totalScore = 0;


        for (int i = 0; i < arr1.length; i++) {
            String temp = arr1[i];
            String[] arr2 = temp.split(";");
            String scoreStr = arr2[2];
            int score =  Integer.parseInt(scoreStr);
            totalScore = totalScore +score;

        }


        System.out.println(totalScore/arr1.length);



    }
}
