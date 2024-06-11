package org.example.exercice4.model;

import java.time.LocalDate;
import java.util.Date;

public class Dog {
    private String name;
    private String breed;
    private String favoriteMeal;
    private LocalDate birthDate;


    public Dog(String name, String breed, String favoriteMeal, LocalDate birthDate) {
        this.name = name;
        this.breed = breed;
        this.favoriteMeal = favoriteMeal;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFavoriteMeal() {
        return favoriteMeal;
    }

    public void setFavoriteMeal(String favoriteMeal) {
        this.favoriteMeal = favoriteMeal;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
