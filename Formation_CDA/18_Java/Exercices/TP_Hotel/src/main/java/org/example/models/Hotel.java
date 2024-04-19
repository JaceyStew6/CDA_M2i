package org.example.models;

import java.util.List;

public class Hotel {

    private String hotelName;

    private List<Room> roomList;
    private List<Reservation> reservationList;
    private List<Client> clientList;

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
    }
}
