package com.advance.adv5_Collections_Path.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Write a Java program to find the longest word in a text file.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Users/ACASA/IdeaProjects/curs_Java/sold100.txt");
        if (!path.toFile().exists()) {
            System.out.println("File not found");
            return;
        }
        List<String> lines = Files.readAllLines(path);
        String max = "";
        for (String line : lines) {
            for (String word: line.split(" ")) {
                if (word.length() > max.length()) {
                    max = word;
                }
            }
        }
        System.out.println("Max word: " + max);

    }
}
