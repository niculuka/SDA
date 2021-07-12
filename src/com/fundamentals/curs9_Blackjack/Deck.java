package com.fundamentals.curs9_Blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deck {

    private List<Card> cardList;

    public Deck() {
        this.cardList = getCardList();
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cardList=" + "\n" + cardList +
                '}';
    }

    public List<Card> getCardList() {
        List<String> suits = new ArrayList<>();
        List<Card> cardList = new ArrayList<>();

        suits.add("Clubs");
        suits.add("Diamonds");
        suits.add("Hearts");
        suits.add("Spades");

        for (int i = 1; i <= 13; i++) {
            for (String suit : suits) {
                if (i == 1) {
                    Card card = new Card(1, "Ase", suit);
                    cardList.add(card);
                }
                else if (i == 11) {
                    Card card = new Card(10, "Jack", suit);
                    cardList.add(card);
                }
                else if (i == 12) {
                    Card card = new Card(10, "Queen", suit);
                    cardList.add(card);
                }
                else if (i == 13) {
                    Card card = new Card(10, "King", suit);
                    cardList.add(card);
                }
                else {
                    Card card = new Card(i,String.valueOf(i), suit);
                    cardList.add(card);
                }
            }
        }

        return cardList;


    }

    public void shuffle() {
        for (int i = 0; i < 1000; i++) {
            int randomIndex1 = (int) (Math.random() * 52);
            int randomIndex2 = (int) (Math.random() * 52);

            Card c1 = this.cardList.get(randomIndex1);
            Card c2 = this.cardList.get(randomIndex2);

            this.cardList.set(randomIndex1, c2);
            this.cardList.set(randomIndex2, c1);
        }
    }
    public Card drawCard() {
        Card drawCards = cardList.get(0);
        cardList.remove(0);
        return drawCards;
    }

    public Card drawCard(Scanner scanner) {

        Card drawCards = cardList.get(0);
        if (drawCards.getValue() == 1) {
            System.out.println("You have an Ace. Choose value: 1 or 11.");
            int value = scanner.nextInt();
            while (value != 1 && value != 11) {
                System.out.println("Insert a valid value!");
                value = scanner.nextInt();

            }
            drawCards.setValue(value);
        }
        cardList.remove(0);
        return drawCards;
    }

}
