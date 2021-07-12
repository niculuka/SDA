package com.fundamentals.curs3_Exercitii;

public class Ex_3 {
    public static void main (String[] args) {
        multiplyString("abc", 2);

    }

    public static void  multiplyString (String text, int times) {
        String x = "";
        for (int index = 0; index < times; index ++) {
            x = x + text;
        }
        System.out.println(x);
    }
}
