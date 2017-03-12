package com.batraining.javabase.course06.homework;

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

    public Card() {
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
