package com.fundamentals.curs4_Classes;

public class Pet {
    String type;
    int weight;
    String name;
    String sound;

    public void pet() {
        System.out.println("Tipul animalului este " + this.type + ", are greutatea de " + this.weight + " kg " +
                ", are numele " + this.name + " si zice asa: " + sound + ".");
    }
}
