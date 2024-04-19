package org.example.models;

public class Reservation {

    private int reservationNumber;
    private boolean status;

    private Client client;
    private Room room;

    private static int numberOfReservation = 0;

    public Reservation(Client client, Room room) {
        this.reservationNumber = ++numberOfReservation;
        this.client = client;
        this.room = room;
    }
}
