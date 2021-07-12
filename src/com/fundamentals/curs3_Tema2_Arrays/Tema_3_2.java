package com.fundamentals.curs3_Tema2_Arrays;

// Se da un array int[] = {1,53,2,5,8,9,331, 0}.
// Sa  se implementeze o metoda care returneaza cel mai mic numar din array.

public class Tema_3_2 {
    public static void main(String[] args) {
        int[] numbers = {1, 53, 2, 5, 8, 9, 331, 0};

        theSmallestNumber(numbers);
    }

    public static void theSmallestNumber( int[] arrayNumber ) {
        int smallestNumber = arrayNumber[0];
        for (int index = 0; index < arrayNumber.length; index++) {
            if (arrayNumber[index] < smallestNumber) {
                smallestNumber = arrayNumber[index];
            }
        }
        System.out.println("The smallest number is: " + smallestNumber);
    }

}
