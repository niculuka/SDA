package com.fundamentals.curs3_Exercitii;

public class Ex_7 {
    public static void main (String[] args) {
        int[] numbers = {7, 5, 11, 3, 77, 32, 43, 98};
        showEvenPosition(numbers);
        showEvenNumber(numbers);
    }

    public static void  showEvenPosition(int[] numberArray) {
        for(int index = 0; index < numberArray.length; index++) {
            if(index%2 == 0) {
                System.out.println("Number array is: " + numberArray[index]);
            }
        }
    }

    public static void  showEvenNumber(int[] numberArray) {
        for(int index = 0; index < numberArray.length; index++) {
            if(numberArray[index]%2 == 0) {
                System.out.println(numberArray[index]);
            }
        }
    }

}
