package com.batraining.javabase.course05.question;

import java.util.Arrays;

/**
 * Created by pengfei on 2017/1/10.
 */
public class Question {
    private String title;

    private String[] options;//选项


    private String[] rightAnswers;


    public Question() {
    }

    public Question(String title, String[] options, String[] rightAnswers) {
        this.title = title;
        this.options = options;
        this.rightAnswers = rightAnswers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public String[] getRightAnswers() {
        return rightAnswers;
    }

    public void setRightAnswers(String[] rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public void print(){
        System.out.println("题目：" + this.getTitle());
        System.out.println("选项：" + Arrays.toString(options));

    }

    public void checkAnswer(String[] rightAnswers){


    }
}
