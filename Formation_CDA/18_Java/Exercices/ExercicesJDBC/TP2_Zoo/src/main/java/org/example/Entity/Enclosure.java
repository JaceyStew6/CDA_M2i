package org.example.Entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Enclosure {
    private int enclosure_id;
    private String enclosureName;
    private List<Animal> animals;
}