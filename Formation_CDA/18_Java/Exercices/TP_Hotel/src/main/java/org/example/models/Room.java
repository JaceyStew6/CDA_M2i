package org.example.models;

public class Room {

    private int roomNumber;
    private boolean status;
    private double price;
    private int capacity;

    public Room(int chamberNumber, boolean status, double price, int capacity) {
        this.roomNumber = chamberNumber;
        this.status = status;
        this.price = price;
        this.capacity = capacity;
    }
}
