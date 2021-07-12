package com.fundamentals.curs9_Blackjack;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

    private List<Card> dealerCards = new ArrayList<>();

    void addCard(Card extractedCard) {
        if (extractedCard.getValue() == 1) {
            if (getTotalPoints() + 11 > 21) {
                extractedCard.setValue(11);
                System.out.println("Dealer got an Ace.");
            }
            else {
                System.out.println("Ace value = 1");
            }
        }
        dealerCards.add(extractedCard);
    }

    @Override
    public String toString() {
        return "Dealer first card = "+ dealerCards + ", 2nd card is hidden";
    }

    public int getTotalPoints() {
        int sum = 0;
        for (Card card : dealerCards) {
            sum = sum + card.getValue();
        }
        return sum;
    }



}
