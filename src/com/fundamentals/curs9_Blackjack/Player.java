package com.fundamentals.curs9_Blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> playerCards = new ArrayList<>();

    public void addCard(Card extractedCard) {
        this.playerCards.add(extractedCard);

    }

    @Override
    public String toString() {
        return "PlayerCards = " + playerCards + "\n" + "total points= " + getTotalPoints();
    }

    public int getTotalPoints() {
        int sum = 0;
        for (Card card : playerCards) {
            sum = sum + card.getValue();
        }
        return sum;
    }
}
