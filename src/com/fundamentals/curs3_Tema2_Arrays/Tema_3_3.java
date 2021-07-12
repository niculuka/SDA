package com.fundamentals.curs3_Tema2_Arrays;

// Se da un array int[] = {1,2,2,2,4,5,8,2,9,0} si un integer X.
// Sa se genereze un nou array care contine int[index] + X.
// De exemplu, pentru array-ul descris anterior, si X = 2, ar trebui sa se returnze {3,4,4,4,6,7,10,4,11,2}.

public class Tema_3_3 {
    public static void main(String[] args) {
        int[] number = {1, 2, 2, 2, 4, 5, 8, 2, 9, 0};
        newArray(2, number);

        //solutia 2 -----------------------------------------------------
        int[] number2 = {1, 2, 2, 2, 4, 5, 8, 2, 9, 0};
        int b=2;
        for(int value: number2) {
            System.out.println(value+b);
        }
        //solutia 2 -----------------------------------------------------

    }

    public static void newArray (int a, int[] numbersArray) {
        for (int index = 0; index < numbersArray.length; index++) {
            numbersArray[index]= numbersArray[index] + a;


            System.out.println(numbersArray[index]);

        }
        System.out.println("---------------------------");
    }

}
