package com.batraining.javabase.course05.question;

import com.batraining.javabase.course05.question.Question;

import java.util.Arrays;

/**
 * Created by pengfei on 2017/1/10.
 */
public class SigleQuestion extends Question {
    public SigleQuestion(String title, String[] options, String[] rightAnswers) {
        super(title, options, rightAnswers);
        if (rightAnswers.length>1){
            System.err.println("正确答案超过一个");
        }



    }

    @Override
    public void print() {
        System.out.println("请注意:这是一个单选题");
        super.print();

    }

    @Override
    public void checkAnswer(String[] rightAnswers) {
        if(rightAnswers.length!=1){
            System.err.println("参数错误");
            return;
        }

        if (Arrays.equals(this.getRightAnswers(),rightAnswers)){
            System.out.println("你答对了！");
        }

    }
}
