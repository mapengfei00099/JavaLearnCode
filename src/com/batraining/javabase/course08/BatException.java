package com.batraining.javabase.course08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**自定义异常的方式：继承Exception
 * Created by pengfei on 2017/3/26.
 */
public class BatException extends Exception{
    private int code;
    private String course;

    public BatException(String message, int code, String course) {
        super(message);
        this.code = code;
        this.course = course;
    }

    public static void main(String[] args) throws BatException,IOException {
        //如果学生的成绩不及格 或者缺考抛出BatException，
        // 其中code=100 代表成绩为1-59 code =101 代表成绩为0，也就是缺考
        // 考试科目有2门 Java Linux 工2门
        //如果考试及格，将成绩写入文件

       // checkScore("Java",59);//抛出BatException
        //如果抛出异常没有捕获的话，程序就在此中断，也就是说不会继续执行
       // checkScore("Java",0);
        checkScore("Java",80);

    }
    //一个方法里可以抛出多个异常
   public static  void  checkScore(String course,int score) throws BatException, IOException {
        if(score<60&&score>0){
            throw new  BatException("考试不及格",100,course);
        }
       if(score==0){
           throw new  BatException("缺考",101,course);
       }

       File file = new File("score.txt");
       FileWriter fileWriter = new FileWriter(file);
       fileWriter.write(String.valueOf(score));
       fileWriter.close();



    }

}
