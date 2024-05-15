package org.example.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnimalEnclosure {
    private int id;
    private int id_animal;
    private int id_enclosure;
}