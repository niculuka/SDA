package com.fundamentals.curs3_Tema2_Arrays;

// Se da un array int[] = {1,53,2,5,8,9,331, 0}.
// Sa  se implementeze o metoda care returneaza cel mai mare numar din array.

public class Tema_3_1 {
    public static void main(String[] args) {
        int[] numbers = {1, 53, 2, 5, 8, 9, 331, 0};

        theBiggestNumber(numbers);
    }

    public static void theBiggestNumber( int[] arrayNumber ) {
        int biggestNumber = arrayNumber[0];
        for (int index = 0; index < arrayNumber.length; index++) {
            if (arrayNumber[index] > biggestNumber) {
                biggestNumber = arrayNumber[index];
            }
        }
        System.out.println("The biggest number is: " + biggestNumber);
    }



}
