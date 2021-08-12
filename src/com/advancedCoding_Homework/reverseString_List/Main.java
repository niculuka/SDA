package com.advancedCoding_Homework.reverseString_List;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Car", "boat", "train", "Bike");
        List<String> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortedList.forEach(word -> System.out.println(word));
    }
}