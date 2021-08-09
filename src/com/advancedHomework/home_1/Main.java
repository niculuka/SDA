package com.advancedHomework.home_1;

import java.util.Scanner;

/**
 * Reverse a number using while Loop.
 * The program will prompt user to input the number and then, it will reverse the same number using while loop.
 */
public class Main {
    public static void main(String args[])
    {
//        int num = 0;
//        int reversenum = 0;
//        System.out.println("Input your number and press enter: ");
//        Scanner in = new Scanner(System.in);
//        num = in.nextInt();
//        while( num != 0 )
//        {
//            reversenum = reversenum * 10;
//            reversenum = reversenum + num % 10;
//            num = num/10;
//        }
//        System.out.println("Reverse of input number is: " + reversenum);
//        System.out.println("===========================================================");



        System.out.println("Input your number and press enter: ");
        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();

        String numberString = String.valueOf(number);
        for(int i = numberString.length()-1; i < numberString.length(); i--) {
            if (i>=0) {
                char numberChar = numberString.charAt(i);
                System.out.print(numberChar);
            }
        }
    }


}
