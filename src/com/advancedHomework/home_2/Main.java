package com.advancedHomework.home_2;

import java.util.*;
/**
 * Write a program that receives array size (n) from user (System.in).
 * Next, receive n numbers from user and put them in the array.
 * Implement bubble sort algorithm to sort this array in ascending order.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 1;
        List<Integer> list = new ArrayList<>();
        while (true) {
            System.out.println("Input number " + inputNumber + ": ");
            int number = scanner.nextInt();
            inputNumber++;
            list.add(number);
            Collections.sort(list);
            System.out.println("Sorted List: " + list);
        }
    }
}
