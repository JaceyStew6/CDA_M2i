package org.example.exercices.exercice11Exception.exercice4.model;

import org.example.exercices.exercice11Exception.exercice4.exception.InvalidAgeException;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) throws InvalidAgeException {
        if (age < 0){
            throw new InvalidAgeException("L'age ne peut pas etre negatif.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student : " +
                "name='" + name + '\'' +
                ", age=" + age +
                '.';
    }
}
