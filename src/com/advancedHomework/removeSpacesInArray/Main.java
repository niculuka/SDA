package com.advancedHomework.removeSpacesInArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String words = "a bc  def   ghij";

        List<String> newWords = new ArrayList<>();

        String[] splitWords = words.split(" ");



        for (int i = 0; i < splitWords.length ; i++) {

            if (!splitWords[i].contains(" ")) {
                newWords.add(splitWords[i].trim());

            }
            if (!splitWords[i].isBlank()) {
                System.out.println(splitWords[i]);
            }


        }
        System.out.println(newWords);

    }
}