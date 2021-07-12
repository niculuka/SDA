package com.fundamentals.curs3;

public class Main {

    public static void main(String[] args) {
	int prod = calculateProduct(3,7);
	int prod2 = calculateProduct(5,8);


        System.out.println(prod);
        System.out.println(prod2);
    }

    public static int calculateProduct(int a, int b) {
        int prod = 1;
        for (int index = a; index <= b; index++) {
            prod = prod * index;
        }
        return prod;


    }

}
