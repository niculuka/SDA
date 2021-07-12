package com.fundamentals.curs6_Parking;

public abstract class ParkingSpot {
    int spotNumber;
    private double price;
    private boolean status = false;


    public ParkingSpot(int spotNumber, boolean status){
        this.spotNumber = spotNumber;
        this.status = status;
    }
    public abstract int discount();

    public void generateTicket(){
        double priceWithDiscout = this.price - (this.price * discount() / 100);
        System.out.println("Generating ticket for parking spot with value " + priceWithDiscout);

    }

    public void bookSpot(){
        if(this.status == true){
            System.out.println("Locul este ocupat");
        } else {
            this.status = true;
            this.generateTicket();
            System.out.println("Locul " + this.spotNumber + " a fost ocupat");
        }
    }

    public void freeSpot(){
        this.status = false;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 1) {
            System.out.println("Pretul nu poate fi mai mic decat 1");
            this.price = 1;
        } else {
            this.price = price;
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
