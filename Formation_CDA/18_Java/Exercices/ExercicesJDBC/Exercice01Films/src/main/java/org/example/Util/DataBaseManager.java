package org.example.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {

    private static final String URI = "jdbc:mysql://localhost:3306/exercice1_movies";
    private static final String USER = "root";
    private static final String PASSWORD = "Starbucks@6";

    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection(URI,USER,PASSWORD);
    }

}
