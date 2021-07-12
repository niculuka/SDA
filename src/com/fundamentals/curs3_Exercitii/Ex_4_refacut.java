package com.fundamentals.curs3_Exercitii;

public class Ex_4_refacut {
    public static void main(String[] args) {
        countDown(10, 1);
    }

    public static void countDown(int a, int b) {

        if (a > b) {
            for (int index = a; index >= b; index--) {
                if (index == 5) {
                    System.out.println("---");
                }
                else {
                    System.out.println(index);
                }
            }
        }
        else {
            System.out.println("Primul numar trebuie sa fie mai mare ca celalat");
        }
    }
}
