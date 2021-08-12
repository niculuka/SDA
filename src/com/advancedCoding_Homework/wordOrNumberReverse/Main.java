package com.advancedCoding_Homework.wordOrNumberReverse;

import java.util.Scanner;


public class Main {
    public static void main(String args[])    {
        System.out.println("Input your number and press enter: ");
        Scanner inputWord = new Scanner(System.in);
        String word = inputWord.next();
        for(int i = word.length()-1; i < word.length(); i--) {
            if (i>=0) {
                char numberChar = word.charAt(i);
                System.out.print(numberChar);
            }
        }
    }
}
