package org.example.models;

public class Client {

    private int id;
    private String lastName, firstName, phoneNumber;

    private static int nbClient = 0;

    public Client(String lastName, String firstName, String phoneNumber) {
        this.id = ++nbClient;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }
}
