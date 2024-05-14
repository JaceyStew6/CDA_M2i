package org.example.DAO;

import org.example.Entity.Food;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class FoodDAO extends BaseDAO<Food>{

    private AnimalDAO animalsDAO;
    public FoodDAO(Connection connection, AnimalDAO animalDAO) {
        super(connection);
        animalsDAO = animalDAO;
    }

    @Override
    public Food save(Food element) throws SQLException {
        try{
            request = "INSERT INTO Food (dateAndTime,foodDetails,id_animal) VALUE (?,?,?)";
            preparedStatement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setDate(1, Date.valueOf(element.getDateAndTime()));
            preparedStatement.setString(2, element.getFoodDetails());
            preparedStatement.setInt(3, element.getAnimal().getAnimal_id());
            int nbrow = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            Food food = null;
            if (resultSet.next()){
                food = Food.builder()
                        .dateAndTime(element.getDateAndTime())
                        .foodDetails(element.getFoodDetails())
                        .animal(element.getAnimal())
                        .food_id(resultSet.getInt(1))
                        .build();
            }
            if (nbrow != 1){
                _connection.rollback();
            }
            _connection.commit();
            return food;
        }catch(SQLException e){
            _connection.rollback();
            return null;
        }
    }

    @Override
    public Food update(Food element) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(Food element) throws SQLException {
        return false;
    }

    @Override
    public Food getAnimalByName(String animalName) throws SQLException {
        return null;
    }

    @Override
    public List<Food> get() throws SQLException {
        return null;
    }
}