package com.fundamentals.curs9_Blackjack;

import java.util.Locale;
import java.util.Scanner;

// Generate a cards deck
// Shuffle method for deck
// Extract first card
// If player gets more than 21 points => game lost
// If player gets 21 points, then black jack!

// Aplicatia trebuie sa aibe un dealer, care va extrage o carte, doar daca punctajul lui e sub 17 puncte
// Cand pornim jocul, dealerul trebuie sa primeasca 2 carti, din care doar una e vizibila jucatorului
// Jucatorul trebuie sa primeasca si el 2 carti
// Cand pornim jocul, jucatorul va fi informat ca are  de ex  un 7 de trefla si o carte ascunsa
// Dealerul poate extrage 1 sau mai multe carti, doar dupa ce jucatorul nu mai doreste sa extraga alta carte
// Jucatorul trebuie sa poate alege valuarea Ass-ului.
// Tema: alegerea valorii asului dupa ce primele doua carti sunt vizibile la player.


public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();

        Player player = new Player();
        Dealer dealer = new Dealer();
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        boolean play = true;

        initialDeal(deck, player,dealer, sc);

        while (play) {
            System.out.println("Do you want to draw a card ?");
            String option = sc.next().toUpperCase(Locale.ROOT);

            if (option.equals("Y")) {
                player.addCard(deck.drawCard(sc));
                System.out.println(player);
                if (player.getTotalPoints() > 21) {
                    System.out.println("Game lost. More then 21 points");
                    play = false;
                }
                else if (player.getTotalPoints() == 21) {
                    System.out.println("Black Jack");
                    play = false;
                }
            }
            else {
                play = false;
                while (dealer.getTotalPoints() < 17) {
                    dealer.addCard(deck.drawCard());
                    System.out.println("Dealer new card" + dealer.getTotalPoints());
                }
                if (dealer.getTotalPoints() > 21) {
                    System.out.println("Player wins");
                }
                else if (dealer.getTotalPoints() > player.getTotalPoints()) {
                    System.out.println("Dealer wins");
                }

            }
        }
//        System.out.println(deck);
//        System.out.println(deck.drawCard());
//        System.out.println(deck.drawCard());
    }

    public static void initialDeal(Deck deck, Player player, Dealer dealer, Scanner sc) {
        System.out.println("Initial deal");
        dealer.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());
        System.out.println(dealer);
        player.addCard(deck.drawCard(sc));
        player.addCard(deck.drawCard(sc));
        System.out.println(player);
    }

}
