package com.fundamentals.curs3_Tema2_Arrays;

// Se da un array int[] = {1,2,2,4,1,1,1,2,5,1,0}.
// Sa se genereze un nou array unde toate valoarile diferite de 1 sunt inlocuite cu 0 (zero).
// De exemplu pentru array-ul prezentat anterior {1,0,0,0,1,1,1,0,0,1,0}.

public class Tema_3_4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 4, 1, 1, 1, 2, 5, 1, 0};
        replaceValues(numbers);

    }

    public static void replaceValues(int[] numberArray) {
        for (int index = 0; index < numberArray.length; index++) {
            if (numberArray[index] == 1) {
                numberArray[index] = numberArray[index];
            }
            else {numberArray[index] = 0;
            }
            System.out.println(numberArray[index]);
        }
    }
}
