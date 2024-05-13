package org.example.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Movie {

    private int movieId;
    private String title;
    private String director;
    private String releaseDate;
    private String movieType;

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + title + '\'' +
                ", réalisateur='" + director + '\'' +
                ", dateSortie=" + releaseDate +
                ", genre='" + movieType + '\'' +
                '}';
    }
}
