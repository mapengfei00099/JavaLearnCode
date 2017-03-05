package com.batraining.javabase.course05.question;


import com.batraining.javabase.course05.SigleQuestion;

/**
 * Created by pengfei on 2017/1/10.
 */
public class QuestionTest {
    public static void main(String[] args) {
        Question question = new SigleQuestion("1+1=?",
                new String[]{"a:1","b:2","c:3","d:4"},new String[]{"b"});

        Question question1 = new MutilQuestion("大于1的数有?",new String[]{"a:1",
                "b:0","c:3","d:4"},new String[
                        ]{"c","d"});
        question.print();
        question.checkAnswer(new String[]{"b"});

        question1.print();
        question1.checkAnswer(new String[]{"c","d"});


    }
}
