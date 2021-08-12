package com.advancedCoding_Homework.implementMethods_E_;

import java.util.HashMap;
import java.util.Map;

public class CCCHashSetImpl<E> implements CCCHashSet<E>{
    private final Map<E, Object> map = new HashMap<>();

    @Override
    public void add(E element) {
        map.put(element, null);
    }

    @Override
    public void remove(E element) {
        map.remove(element);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean contains(E element) {
        if (map.containsKey(element)) {
            System.out.println("Element: " + element);
        } else {
            System.out.println("Element: " + element + " - DOEST NOT EXIST!");
        }

        return map.containsKey(element);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public String toString() {
        return "CCCHashSetImpl{" +
                "map=" + map +
                '}';
    }
}
