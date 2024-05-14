package org.example.Entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder

public class Food {
    private int food_id;
    private LocalDate dateAndTime;
    private String foodDetails;
    private Animal animal;

}
