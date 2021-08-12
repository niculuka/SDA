package com.advancedCoding.ex4;
import java.util.HashMap;

/**
 * Create a Storage class that will have a private Map field, a public constructor, and methods:
 * addToStorage(String key, String value) → adding elements to the storage
 * printValues(String key) → displaying all elements under a given key
 * findValues(String value) → displaying all keys that have a given value
 * The Storage class should allow you to store multiple values under one key
 */

public class Main {
    public static void main(String[] args) {
        Storage zooStorage = new StorageImpl(new HashMap<>());
        zooStorage.addToStorage("bear", "Teddy");
        zooStorage.addToStorage("bear", "Grizzly");
        zooStorage.addToStorage("bear", "Brown");
        zooStorage.addToStorage("bear", "Panda");
        zooStorage.addToStorage("cat", "meau");
        zooStorage.addToStorage("cat", "pissi");
        zooStorage.addToStorage("cat", "Teddy");
        System.out.println(zooStorage);
        System.out.println("-----------------------------------");

        zooStorage.printValues("cat");
        zooStorage.printValues("bear");
        zooStorage.printValues("aaa");
        System.out.println("-----------------------------------");

        zooStorage.findValues("Teddy");
        System.out.println("-----------------------------------");

        zooStorage.findValues("Te");
        System.out.println("-----------------------------------");
    }
}
