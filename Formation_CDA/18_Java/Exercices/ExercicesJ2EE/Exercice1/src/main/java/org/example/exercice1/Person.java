package org.example.exercice1;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person() {
    }

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }
}
