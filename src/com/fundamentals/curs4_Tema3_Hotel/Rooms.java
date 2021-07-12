package com.fundamentals.curs4_Tema3_Hotel;

public class Rooms {
    String type;
    boolean isBooked = false;
    int n;
    Person p;


    public Rooms (String type, boolean isBooked, int n, Person p) {
        this.type = type;
        this.isBooked = isBooked;
        this.n = n;
        this.p = p;

    }


    public void bookRoom() {
        if (!isBooked) {
            System.out.println("Camera numarul " + n + " este libera.");
        }
        else {
            System.out.println("Camera numarul " + n + " este ocupata de " + p);
            isBooked = true;
        }
    }




}
