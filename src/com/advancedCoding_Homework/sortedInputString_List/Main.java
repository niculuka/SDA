package com.advancedCoding_Homework.sortedInputString_List;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 1;
        while (true) {
            System.out.println("Input number " + inputNumber + ": ");
            String word = scanner.next();
            inputNumber++;
            list.add(word);
            Collections.sort(list);
            System.out.println("Sorted List: " + list);
        }



//        List<String> list = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        int inputNumber = 1;
//        while (true) {
//            System.out.println("Input number " + inputNumber + ": ");
//            String word = scanner.next();
//            inputNumber++;
//            list.add(word);
//            List<String> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//            sortedList.forEach(w -> System.out.println(w));
//            System.out.println("Sorted List: " + list);
//        }
    }
}
