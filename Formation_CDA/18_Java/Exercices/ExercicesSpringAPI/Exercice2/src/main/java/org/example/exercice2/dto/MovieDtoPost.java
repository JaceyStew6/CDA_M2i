package org.example.exercice2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDtoPost {
    private String title;
    private String releaseDate;
    private String description;
    private String duration;
    private String type;
}
