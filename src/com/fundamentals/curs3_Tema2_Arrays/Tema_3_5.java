package com.fundamentals.curs3_Tema2_Arrays;

// Se da un array int[] = {1,2,3,2,2,4,1} si un integer X.
// Sa se implementeze o metoda care numara de cate ori s-a indetificat X in array.
// De exemplu pt. X =1, trebuie sa obtinem 2, pentru X = 2, trebuie sa obtinem 3.

public class Tema_3_5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 2, 4, 1};
        countNumbers(1, numbers);

    }

    public static void countNumbers(int x, int[] numberArray) {
        int count = 0;
        for (int index = 0; index < numberArray.length; index++) {
            if (numberArray[index] == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
