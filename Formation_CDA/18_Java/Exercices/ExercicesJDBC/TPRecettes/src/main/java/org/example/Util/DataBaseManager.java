package org.example.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {
    private static final String URI = "jdbc:mysql://localhost:3306/recipe_database";
    private static final String USER = "root";
    private static final String PASSWORD = "Starbucks_6";

    public static Connection getConnection () throws SQLException {
        Connection connection = DriverManager.getConnection(URI,USER,PASSWORD);
        connection.setAutoCommit(false);
        return connection;
    }

}
