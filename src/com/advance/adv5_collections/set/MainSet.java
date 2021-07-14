package com.advance.adv5_collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Create a set consisting of colors - given from the user.
 */
public class MainSet {
    public static void main(String[] args) {
        Set<String> colors  = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String color = "";

        while (!color.equals("stop")) {
            System.out.println("Enter a color!");
            color = scanner.nextLine();
            colors.add(color);
            for (String colorItem : colors) {
                System.out.println(colorItem);
            }

        }
    }

}
