package org.example.Util;

import org.example.DAO.MovieDAO;
import org.example.Entity.Movie;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Ihm {

    private Connection connection;
    private MovieDAO movieDAO;
    private Scanner scanner;

    public Ihm(){
        scanner = new Scanner(System.in);
        try{
            connection = DataBaseManager.getConnection();
            movieDAO = new MovieDAO(connection);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void start(){
        int entry;
        while(true){
            System.out.println("------Gestion de films------");
            System.out.println("1. Création de film");
            System.out.println("2. Liste des films");

            entry = scanner.nextInt();
            scanner.nextLine();

            switch (entry){
                case 1:
                    createMovie();
                    break;
                case 2:
                    getAllMovies();
                    break;
            }
        }
    }

    private void createMovie(){
        System.out.println("------Création de film------");
        System.out.println("titre du film: ");
        String title = scanner.nextLine();
        System.out.println("nom du réalisateur: ");
        String director = scanner.nextLine();
        System.out.println("date de sortie: ");
        String releaseDate = scanner.nextLine();
        System.out.println("Genre: ");
        String type = scanner.nextLine();
        try{
            Movie movie = movieDAO.createMovie(title, director, releaseDate, type);
            System.out.println("Le film a été créé " + movie );
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    private void getAllMovies(){
        try{
            List<Movie> movies = movieDAO.getAllMovies();
            for(Movie movie : movies){
                System.out.println(movie);
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
