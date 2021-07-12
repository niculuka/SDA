package com.fundamentals.curs3_Exercitii;

public class Ex_2_refacut {
    public static void main(String[] args) {
        int fact = calcFact(4);
        System.out.println("Factorialul numarului tau  este: " + fact);
    }

    public static int calcFact(int a) {
        int fact = 1;
        for (int index = 1; index <= a; index++) {
            fact = fact * index;
        }
        return fact;
    }


}
