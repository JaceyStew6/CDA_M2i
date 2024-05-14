package org.example.DAO;

import org.example.Entity.Animal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO extends BaseDAO<Animal> {
    public AnimalDAO(Connection connection) {
        super(connection);
    }

    @Override
    public Animal save(Animal element) throws SQLException {
        try{
            request = "INSERT INTO Animal (animalName,breed,animalDescription,habitat,animalAge) VALUE (?,?,?,?,?)";
            preparedStatement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, element.getAnimalName());
            preparedStatement.setString(2, element.getBreed());
            preparedStatement.setString(3, element.getAnimalDescription());
            preparedStatement.setString(4, element.getHabitat());
            preparedStatement.setInt(5, element.getAnimalAge());
            int nbrow = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            Animal animal = null;
            if (resultSet.next()){
                animal = Animal.builder()
                        .animalName(element.getAnimalName())
                        .breed(element.getBreed())
                        .animalDescription(element.getAnimalDescription())
                        .habitat(element.getHabitat())
                        .animalAge(element.getAnimalAge())
                        .animal_id(resultSet.getInt(1))
                        .build();
            }
            if (nbrow != 1){
                _connection.rollback();
            }
            _connection.commit();
            return animal;

        }catch(SQLException e){
            _connection.rollback();
            return null;
        }
    }

    @Override
    public Animal update(Animal element) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(Animal element) throws SQLException {
        return false;
    }

    @Override
    public Animal getAnimalByName(String animalName) throws SQLException {
        request = "SELECT * FROM Animal WHERE animalName = ?";
        preparedStatement = _connection.prepareStatement(request);
        preparedStatement.setString(1, animalName);
        resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            return Animal.builder()
                    .animal_id(resultSet.getInt("animal_id"))
                    .animalName(resultSet.getString("animalName"))
                    .breed(resultSet.getString("breed"))
                    .animalDescription(resultSet.getString("animalDescription"))
                    .habitat(resultSet.getString("habitat"))
                    .animalAge(resultSet.getInt("animalAge"))
                    .build();
        }
    return null;
    }

    @Override
    public List<Animal> get() throws SQLException {
        List<Animal> animals = new ArrayList<>();
        request = "SELECT * FROM Animal";
        preparedStatement = _connection.prepareStatement(request);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            animals.add(Animal.builder()
                    .animal_id(resultSet.getInt("animal_id"))
                    .animalName(resultSet.getString("animalName"))
                    .breed(resultSet.getString("breed"))
                    .animalDescription(resultSet.getString("animalDescription"))
                    .habitat(resultSet.getString("habitat"))
                    .animalAge(resultSet.getInt("animalAge"))
                    .build());
        }
        return animals;
    }
}
