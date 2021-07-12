package com.fundamentals.curs4_Classes;

public class Main {

    public static void main(String[] args) {
        Pet cat = new Pet();
        cat.type = "pisicuta";
        cat.weight = 3;
        cat.name = "motanita";
        cat.sound = "oaiiiii";
        cat.pet();

        Pet dog = new Pet();
        dog.type = "caine";
        dog.weight = 6;
        dog.name = "Pluto";
        dog.sound = "hauuuuu";
        dog.pet();


        System.out.println("-------------------------------------------------------------------");


        Person p1 = new Person();
        p1.nume = "Dorel";
        p1.prenume = "Distrugatorul";
        p1.age = 18;

        Person p2 = new Person();
        p2.nume = "Hagi";
        p2.prenume = "Gica";
        p2.age = 50;

        Person[] persons = {p1, p2};
        for (int i = 0; i < persons.length; i++) {
            persons[i].sasyHello();
        }


        System.out.println("-------------------------------------------------------------------");


        Engine engine = new Engine(1000, "id-1");
        Seat seat1 = new Seat(21, false);
        Seat seat2 = new Seat(25, true);
        Seat[] seats = {seat1, seat2};
        Airplane airplane = new Airplane("WizzAir", engine, seats);
        airplane.getInfo();
        seat2.bookSeat();


        System.out.println("-----------------------------------------------------------------------------------------");


        airplane.getInfo();

        Seat[] freeSeats = airplane.getFreeSeats();
        int counter=0;
        for(int index=0; index < freeSeats.length; index++){
            if(freeSeats[index] != null){
                counter++;
            }
        }
        System.out.println("Locuri libere: " + counter);

        airplane.engine.startEngine();
        airplane.engine.increaseSpeed(100);
        airplane.engine.increaseSpeed(200);
        airplane.engine.increaseSpeed(800);
        airplane.engine.increaseSpeed(800);


        System.out.println("-----------------------------------------------------------------------------------------");

    }
}
