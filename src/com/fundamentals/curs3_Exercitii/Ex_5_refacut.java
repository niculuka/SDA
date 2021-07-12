package com.fundamentals.curs3_Exercitii;

public class Ex_5_refacut {
    public static void main(String[] arg) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int index = 0; index < numbers.length; index++) {

            if (numbers[index] > 5) {
                System.out.println("-------");
            } else {
                System.out.println(numbers[index]);
            }

        }
    }
}
