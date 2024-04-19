package org.example.models;

public class Room {

    private int roomNumber;
    private boolean status;
    private double price;
    private int capacity;

    public Room(int roomNumber, boolean status, double price, int capacity) {
        this.roomNumber = roomNumber;
        this.status = status;
        this.price = price;
        this.capacity = capacity;
    }
}
