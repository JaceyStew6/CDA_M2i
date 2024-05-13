package org.example.Demo2.DAO;

import org.example.Demo2.Entity.Plante;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlanteDAO {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private String request;
    private ResultSet resultSet;


    public PlanteDAO (Connection connection){
        this.connection = connection;
    }

    public Plante createPlant (String nom , String color , int age) throws SQLException {
        request = "INSERT INTO plante (name,color,age) VALUE (?,?,?)";
        preparedStatement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1,nom);
        preparedStatement.setString(2,color);
        preparedStatement.setInt(3,age);
        preparedStatement.executeUpdate();
        resultSet = preparedStatement.getGeneratedKeys();
        Plante plante = null;
        if(resultSet.next()){
            plante = Plante.builder().name(nom).color(color).age(age).id_plante(resultSet.getInt(1)).build();
        }

        return plante;
    }

    public List<Plante> getAllPlante () throws SQLException {
        List<Plante> plantes = new ArrayList<>();
        request = "SELECT * FROM plante";
        preparedStatement = connection.prepareStatement(request);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            plantes.add(Plante.builder().id_plante(resultSet.getInt("id"))
                    .name(resultSet.getString("name"))
                    .color(resultSet.getString("color"))
                    .age(resultSet.getInt("age"))
                    .build());
        }
        return plantes;
    }
}
