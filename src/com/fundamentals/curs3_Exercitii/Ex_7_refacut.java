package com.fundamentals.curs3_Exercitii;

public class Ex_7_refacut {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        showEvenPositions(numbers);
        showEvenNumbers(numbers);
        showOddsNumber(numbers);
    }

    public static void showEvenPositions(int[] numbersOfArray) {
        for (int index = 0; index < numbersOfArray.length; index++) {
            if (index%2 == 0) {
                System.out.println("Numerele indexului par e: " + numbersOfArray[index]);
            }


        }
    }

    public static void showEvenNumbers(int[] arrayNumbers_2) {
        for (int index = 0; index < arrayNumbers_2.length; index++) {
            if (arrayNumbers_2[index]%2 == 0) {
                System.out.println("Numerele pare sunt: " + arrayNumbers_2[index]);
            }
        }
    }

    public static void  showOddsNumber(int[] numberArray) {
        for(int index = 0; index < numberArray.length; index++) {
            if(numberArray[index]%2 != 0) {
                System.out.println("Numerele impare sunt: " + numberArray[index]);
            }
        }
    }
}
