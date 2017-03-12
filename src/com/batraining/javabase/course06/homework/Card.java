package com.batraining.javabase.course06.homework;

import com.batraining.javabase.course02.RandomTest;

import java.util.Random;

/**
 * Created by pengfei on 2017/3/12.
 */
public class Card {
    private String face;
    private String suit;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }


    protected String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    protected String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return  this.suit + this.face;
    }

    public static void main(String[] args) {
        String[] f = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] s = {"黑桃","红桃","梅花","方块"};
        Card[] deck = new Card[52];
        int i = 0;
        for (String num : f) {
            for (String suit :s){
                deck[i] = new Card(num,suit);
                i++;
            }

        }

        //洗牌的过程
        for (int j = 0; j < deck.length; j++) {
            Random random = new Random();
            int randomNum = random.nextInt(52);
            Card temp = deck[j];
            deck[j] = deck[randomNum];
            deck[randomNum]  = temp;
        }

        for (Card card : deck) {
            System.out.println(card);
        }
    }
}
