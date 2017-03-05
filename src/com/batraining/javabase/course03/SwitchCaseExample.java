package com.batraining.javabase.course03;

/**
 * Created by pengfei on 2016/10/21.
 */
public class SwitchCaseExample
{
    public static void main(String[] args) {
        char scoreLevel ='a';
        switch (scoreLevel){
            case 'a':
                System.out.println("A等级");break;
            case 'b':
                System.out.println("B等级");break;
            case 'c':
                System.out.println("C等级");break;
            case 'd':
                System.out.println("D等级");break;
            default:
                System.out.println("input error !");
        }
    }
}
