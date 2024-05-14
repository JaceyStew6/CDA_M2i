package org.example.Entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class Animal {

    private int animal_id;
    private String animalName;
    private String breed;
    private String animalDescription;
    private String habitat;
    private int animalAge;

    @Override
    public String toString() {
        return "Animal{" +
                "id_animal=" + animal_id +
                ", animalName='" + animalName + '\'' +
                ", breed='" + breed + '\'' +
                ", description='" + animalDescription + '\'' +
                ", habitat='" + habitat + '\'' +
                ", animalAge=" + animalAge +
                '}';
    }
}
