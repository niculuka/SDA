package com.fundamentals.curs3_Exercitii;

public class Ex_3_refacut {
    public static void main(String[] args) {
        multString("A", 3);
        multNumber(2, 3);
    }






    public static void multString(String text, int timesString) {
        String sumText = "";
        for (int index = 0; index < timesString; index ++) {
            sumText = sumText + text;
        }

        System.out.println(sumText);

    }






    public static void multNumber(int number, int timesNumber) {

        int resultNumber = number * timesNumber;
        System.out.println(resultNumber);
    }
}
