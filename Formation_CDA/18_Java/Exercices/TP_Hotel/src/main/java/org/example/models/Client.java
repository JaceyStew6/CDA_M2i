package org.example.models;

public class Client {

    private int id = 0;
    private String lastName, firstName, phoneNumber;

    public Client(String lastName, String firstName, String phoneNumber) {
        this.id = id++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }
}
