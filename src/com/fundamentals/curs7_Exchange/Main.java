package com.fundamentals.curs7_Exchange;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean runAgain = true;

        Scanner sc = new Scanner(System.in);
        List<String> supportedPairs = new ArrayList<>();
        supportedPairs.add("1. RON - EUR");
        supportedPairs.add("2. RON - USD");
        supportedPairs.add("3. EUR - RON");

        while (runAgain == true) {
            int i = 1;
            System.out.println("Supported pairs: ");

            for (String pairs : supportedPairs) {
                System.out.println(pairs);
                i++;
            }

            System.out.println("Please, insert a value");
            int inputValue = sc.nextInt();
            while (inputValue > supportedPairs.size() || inputValue == 0) {
                System.out.println("Please insert a valid option");
                inputValue = sc.nextInt();

            }
            System.out.println("Insert amount");

            double amount = sc.nextDouble();

            switch (inputValue) {
                case 1:
                    System.out.println(amount / 4.92);
                    break;
                case 2:
                    System.out.println(amount / 4.4);
                    break;
                case 3:
                    System.out.println(amount * 4.92);
                    break;
            }

            System.out.println("Do you want to run another conversion ?");
            String userRespose = sc.next();
            if (userRespose.equals("y")) runAgain = true; else runAgain = false;
        }
        System.out.println("Exit");

    }
}
