package com.fundamentals.curs4_Tema3_Hotel;

public class Hotel {

    Rooms[] hotelRooms;
    int totalHotelRooms = 30;

    public Hotel(Rooms[] hotelRooms) {
        this.hotelRooms = hotelRooms;
    }

    public void getFreeRooms() {
        for (int i = 0; i < hotelRooms.length; i++) {
            hotelRooms[i].bookRoom();
        }


        System.out.println();
    }


}
