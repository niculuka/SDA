package com.fundamentals.curs9_Tema5_Hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hangman {

    String getWord;
    int countChar = 0;
    char[] ch;
    Scanner scanner;
    char input;
    boolean gameOn = true;

    public void addList() {
        List<String> words = new ArrayList<>();
        words.add("book");
        words.add("letter");
        words.add("pencil");
        words.add("cooperation");
        words.add("handsome");

        getWord = words.get((int) (Math.random() * words.size()));
        System.out.println(getWord);
    }

    public void getCharNumber() {

        for (int i = 0; i < getWord.length(); i++) {
            countChar = getWord.length();
        }
        System.out.println("Characters: " + countChar);
    }

    public void replaceCharToPoints() {
        ch = new char[getWord.length()];
        for (int i = 0; i < getWord.length(); i++) {
            ch[i] = '.';
        }
        System.out.print(ch);
    }

    public void replacePointsWithInput() {
        scanner = new Scanner(System.in);
        Player player = new Player();
        player.leftLives();


        while (gameOn) {
            System.out.println("Insert a character");
            input = scanner.next().charAt(0);

            for (int i = 0; i < getWord.length(); i++) {
                if (ch[i] == '.') {
                    if (getWord.charAt(i) == input) {
                        ch[i] = input;
                    } else {
                        ch[i] = ch[i];
                    }
                } else {
                    ch[i] = ch[i];
                }
            }
            System.out.print(ch);

            if (!getWord.contains(String.valueOf(input))) {
                player.lives--;
            }
            System.out.println("\n" + "Lives left:" + player.lives);

            if (player.lives == 0) {
                gameOn = false;
                System.out.println("YOU LOST");
                System.out.println("The word was: " + getWord);
            }
            if (getWord.contains(String.valueOf(ch))) {
                gameOn = false;
                System.out.println("YOU WON");
            }
        }
    }
}
