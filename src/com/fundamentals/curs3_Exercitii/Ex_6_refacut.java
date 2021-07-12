package com.fundamentals.curs3_Exercitii;

public class Ex_6_refacut {
    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 44};
        isNumberPartOfArray(44, numbers);
    }

    public static void isNumberPartOfArray(int a, int[] numbersOfArray) {
        boolean foundNumber = false;

        for (int index = 0; index < numbersOfArray.length; index++) {
            if (a == numbersOfArray[index]) {
                foundNumber = true;
            }
        }
        if(foundNumber == true) {
            System.out.println("EXIST");
        }
        else{
            System.out.println("No NUMBER");
        }
    }
}
