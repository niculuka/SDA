package com.fundamentals.curs14_Media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Media {
    private String name;
    private Double ranking;
    private double rankingSum;
    private int counter;

    public Media(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                ", ranking=" + ranking +
                '}';
    }

    public void setRanking(double mark) {
        this.rankingSum = rankingSum + mark;
        counter++;
        this.ranking = rankingSum / counter;

    }

    public void addComments(String comment) {
        try {                                              //%s e inlocuit de catre name
            FileWriter fileWriter = new FileWriter(String.format("%s.txt", name), true);
            fileWriter.write(String.format("%s \n", comment));
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayComments() {
        File file = new File(String.format("%s.txt", name));
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
