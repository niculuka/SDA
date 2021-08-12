package com.advancedCoding_Homework.printByModel_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * map.put("Java", 18);
 * map.put("Python", 1);
 * map.put("Alfa", 10);
 * map.put("Gama", 5);
 * map.put("dELTA", 22);
 * map.put("PHP", 4).
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("Python", 1);
        map.put("Alfa", 10);
        map.put("Gama", 5);
        map.put("dELTA", 22);
        map.put("PHP", 4);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String endString;
            if (!iterator.hasNext()) {
                endString = ".";
            } else {
                endString = ",";
            }
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() + endString);
        }
    }
}
