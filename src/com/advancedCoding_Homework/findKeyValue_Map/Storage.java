package com.advancedCoding_Homework.findKeyValue_Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {
    private Map<String, List<String>> map;

    public Storage(Map<String, List<String>> map) {
        this.map = map;
    }

    public void addToStorage(String key, String value) {
        if (map.containsKey(key)) {
            List<String> existingValues = map.get(key);
            existingValues.add(value);
            map.put(key, existingValues);
        } else {
            List<String> values = new ArrayList<>();
            values.add(value);
            map.put(key, values);
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public void printValues(String key) {
        if (map.containsKey(key)) {
            System.out.println(map.get(key));
        } else {
            System.out.println("NO ENTRY KEY!");
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public void findValues(String value) {
        map.entrySet().forEach(entry -> {
            if (entry.getValue().contains(value)) {
                System.out.println("Key = " + entry.getKey());
            }
        });
    }
    //------------------------------------------------------------------------------------------------------------------
    public void findValues_For(String value) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey());
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    public void findValues_Lambda(String value) {
        List<String> keys = map.entrySet().stream()
                .map(entry -> {
                    if (entry.getValue().contains(value)) {
                        return entry.getKey();
                    }
                    return null;
                })
                .filter(key -> key != null)
                .collect(Collectors.toList());
        System.out.println("Keys for value " + value + ": " + keys.get(0));
    }
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Storage{" +
                "map=" + map +
                '}';
    }
}
