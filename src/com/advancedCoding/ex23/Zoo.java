package com.advancedCoding.ex23;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Zoo {
    private Map<String, Integer> numberOfAnimalsBySpecies = new HashMap<>();

    public int getNumberOfAllAnimals() {
        return numberOfAnimalsBySpecies.values()
                .stream()
                .reduce(0, (currentValue, existingValue) -> currentValue + existingValue);
    }

    public Map <String, Integer> getAnimalsCount() {
        return numberOfAnimalsBySpecies;
    }
    public void addAnimals(String species, int count) {
        if (numberOfAnimalsBySpecies.containsKey(species)) {
            int numberOfAnimals = numberOfAnimalsBySpecies.get(species);
            numberOfAnimalsBySpecies.put(species, numberOfAnimals + count);
        } else {
            numberOfAnimalsBySpecies.put(species, count);
        }
    }

    public Map <String, Integer> getAnimalsCountSorted() {
        TreeMap<String, Integer> sortedAnimalsByCount = new TreeMap<>();
        sortedAnimalsByCount.putAll(numberOfAnimalsBySpecies);
        return sortedAnimalsByCount;
    }
}
