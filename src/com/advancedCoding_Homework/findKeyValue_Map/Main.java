package com.advancedCoding_Homework.findKeyValue_Map;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage(new HashMap<>());
        storage.addToStorage("Color", "White");
        storage.addToStorage("Color", "Black");
        storage.addToStorage("Color", "Red");
        storage.addToStorage("Color", "Yellow");
        storage.addToStorage("Apple", "Golden");
        System.out.println(storage);
        System.out.println("==============================================");

        storage.printValues("Color");
        System.out.println("==============================================");

        storage.findValues("Golden");
        System.out.println("==============================================");

        storage.findValues_For("Golden");
        System.out.println("==============================================");

        storage.findValues_Lambda("Golden");
        System.out.println("==============================================");



    }
}
