package com.fundamentals.curs9_Blackjack;

public class Card {
    private int value;
    private String type;
    private String suit;

    public Card(int value, String type, String suit) {
        this.value = value;
        this.type = type;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
