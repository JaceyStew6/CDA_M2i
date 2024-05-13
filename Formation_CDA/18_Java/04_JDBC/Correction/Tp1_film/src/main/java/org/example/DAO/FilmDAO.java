package org.example.DAO;

import org.example.Entity.Film;


import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO {

    private Connection connection;
    private PreparedStatement statement;
    private String request;
    private ResultSet resultSet;

    public FilmDAO(Connection connection){
        this.connection = connection;
    }

    public Film createFilm (String titre, String realisateur, LocalDate dateDeSortie, String genre) throws SQLException {
        request = "INSERT INTO film (titre,realisateur,date_de_sortie,genre) VALUE (?,?,?,?)";
        statement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1,titre);
        statement.setString(2,realisateur);
        statement.setDate(3,Date.valueOf(dateDeSortie));
        statement.setString(4,genre);
        statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        Film film = null;
        if(resultSet.next()){
            film = Film.builder().titre(titre).realisateur(realisateur).dateSortie(dateDeSortie).genre(genre).id(resultSet.getInt(1)).build();
        }
        return film;
    }

    public boolean updateFilm (int id, String titre, String realisateur, LocalDate dateDeSortie, String genre) throws SQLException{
        request = "UPDATE film SET titre=?, realisateur = ?, date_de_sortie = ?, genre =? WHERE id =?";
        statement = connection.prepareStatement(request);
        statement.setString(1,titre);
        statement.setString(2,realisateur);
        statement.setDate(3,Date.valueOf(dateDeSortie));
        statement.setString(4,genre);
        statement.setInt(5,id);
        int row = statement.executeUpdate();
        return row == 1;
    }

    public boolean deleteFilm (int id) throws SQLException {
        request = "DELETE FROM film WHERE id =?";
        statement = connection.prepareStatement(request);
        statement.setInt(1,id);
        int row = statement.executeUpdate();
        return row ==1;
    }

    public Film get(int id) throws SQLException {
        request = "SELECT * FROM film WHERE id = ?";
        statement = connection.prepareStatement(request);
        statement.setInt(1,id);
        resultSet = statement.executeQuery();
        if(resultSet.next()){
            return  Film.builder().titre(resultSet.getString("titre"))
                    .realisateur(resultSet.getString("realisateur"))
                    .dateSortie(resultSet.getDate("date_de_sortie").toLocalDate())
                    .genre(resultSet.getString("genre")).build();
        }

        return null;
    }

    public List<Film> get() throws SQLException {
        List<Film> films = new ArrayList<>();
        request = "SELECT * FROM film";
        statement = connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while(resultSet.next()){
           films.add(Film.builder().titre(resultSet.getString("titre"))
                    .realisateur(resultSet.getString("realisateur"))
                    .dateSortie(resultSet.getDate("date_de_sortie").toLocalDate())
                    .genre(resultSet.getString("genre")).build());
        }

        return films;
    }
}
