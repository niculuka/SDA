package com.advancedCoding_Homework.splitAndRemoveMultipleSpaces;


public class Main {
    public static void main(String[] args) {
        String words = "a bc  def   ghij";
        String[] splitWords = words.split(" ");
        for (int i = 0; i < splitWords.length ; i++) {
            if (!splitWords[i].isBlank()) {
                System.out.println(splitWords[i]);
            }
        }
    }
}