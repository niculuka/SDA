package com.fundamentals.curs3_Exercitii;

public class Ex_6 {
    public static void main(String[] args) {
        int[] numbers = {7, 12, 42, 21, 13};
        isNumberPartOfArray(21, numbers);
    }

    public static void isNumberPartOfArray(int a, int[] numberArray) {
        boolean foundNumber = false;
        for (int index = 0; index < numberArray.length; index++) {
            if (a == numberArray[index]) {
                foundNumber = true;
            }

        }
        if (foundNumber == true) {
            System.out.println("Found number");
        }
        else {
            System.out.println("Number not found");
        }
    }

}
