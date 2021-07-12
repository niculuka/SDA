package com.fundamentals.curs4_Classes;

public class Seat {
    int rowNumber;
    boolean isAtWindow;
    boolean isBooked;

    public Seat(int rowNumber, boolean isAtWindow) {
        this.rowNumber = rowNumber;
        this.isAtWindow = isAtWindow;
    }

    public void bookSeat() {
        this.isBooked = true;
    }
}
