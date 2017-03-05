package com.batraining.javabase.course05.question;

import java.util.Arrays;

/**
 * Created by pengfei on 2017/1/10.
 */
public class MutilQuestion extends Question {
    public MutilQuestion(String title, String[] options, String[] rightAnswers) {
        super(title, options, rightAnswers);
        if (rightAnswers.length<2){
            System.err.println("正确答案必须大于2个");
        }
    }

    @Override
    public void print() {
        System.out.println("这是一个多选题");
        super.print();
    }

    @Override
    public void checkAnswer(String[] rightAnswers) {
        if(rightAnswers.length<2){
            return;
        }
        if(Arrays.equals(this.getRightAnswers(),rightAnswers)){
            System.out.println("你答对了！");
        }
    }
}
