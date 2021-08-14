package com.advancedCoding.ex27;

import com.advancedCoding.ex19.Computer;
import com.advancedCoding.ex19.Laptop;

/**
 * Design the Joiner<T> class, which in the constructor will take a separator (string) and have a join() method
 * that allows you to specify any number of T-type objects.
 * This method will return a string joining all passed elements by calling their toString() method and separating them with a separator.
 * eg. for Integers and separator "-" it should return: 1-2-3-4 ...
 */
public class Main {
    public static void main(String[] args) {
        Joiner<String> joiner = new Joiner<>("-");
        System.out.println(joiner.join("a", "b", "c", "d", "e", "f"));
        System.out.println("=====================================================================");


        Joiner<Computer_copy> computerJoiner = new Joiner<>("*****");
        Computer_copy laptop_copy1 = new Laptop_copy("3400", "64", "1800", "AMD", "DATASET", "5A");
        Computer_copy laptop_copy2 = new Laptop_copy("3240", "6", "1810", "AMFDD", "DATADSDDSET", "510A");
        System.out.println(computerJoiner.join(laptop_copy1, laptop_copy2));



    }
}
