package com.fundamentals.curs3_Exercitii;

public class Ex_4 {
    public static void main (String[] args) {

        countDown(100, 30);

    }
    public static void countDown (int a, int b) {

        for (int index = a; index >= b; index --) {



            if (index >= 50 && index <= 60) {
                System.out.println("---");
            }
            else {
                System.out.println("indexul e: " + index);
            }

        }
    }
}
