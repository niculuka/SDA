package com.fundamentals.curs3_Exercitii;

public class Ex_2 {
    public static void main(String[] args) {
        int prod = calculateFactorial(3);
        System.out.println("Factorialul e " + prod);
    }

    public static int calculateFactorial (int a) {
        int prod = 1;
        for (int index = 1; index <= a; index ++) {
            prod = prod * index;
        }
        return prod;
    }
}
