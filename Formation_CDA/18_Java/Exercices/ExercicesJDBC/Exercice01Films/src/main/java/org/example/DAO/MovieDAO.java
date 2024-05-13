package org.example.DAO;

import org.example.Entity.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO {

    private final Connection connection;
    private PreparedStatement preparedStatement;
    private String request;
    private ResultSet resultSet;

    public MovieDAO (Connection connection){
        this.connection = connection;
    }

    public Movie createMovie (String title, String director, String releaseDate, String movieType) throws SQLException {
        request = "INSERT INTO Movie (title, director, releaseDate, movieType) VALUE (?,?,?,?)";
        preparedStatement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, title);
        preparedStatement.setString(2, director);
        preparedStatement.setString(3, releaseDate);
        preparedStatement.setString(4, movieType);
        preparedStatement.executeUpdate();
        resultSet = preparedStatement.getGeneratedKeys();
        Movie movie = null;
        if(resultSet.next()){
            movie = Movie.builder().title(title).director(director).releaseDate(releaseDate).movieType(movieType).movieId(resultSet.getInt(1)).build();
        }
        return movie;
    }

    public List<Movie> getAllMovies() throws SQLException{
        List<Movie> movies = new ArrayList<>();
        request = "SELECT * FROM Movie";
        preparedStatement = connection.prepareStatement(request);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            movies.add(Movie.builder().movieId(resultSet.getInt("movies_id"))
                            .title(resultSet.getString("title"))
                            .director(resultSet.getString("director"))
                            .releaseDate(resultSet.getString("releaseDate"))
                            .movieType(resultSet.getString("movieType"))
                            .build());
        }
        return movies;
    }
}