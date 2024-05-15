package org.example.DAO;

import org.example.Entity.Animal;
import org.example.Entity.AnimalEnclosure;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AnimalEnclosureDAO extends BaseDAO<AnimalEnclosure> {
    private AnimalDAO animalDAO;

    public AnimalEnclosureDAO(Connection connection) {
        super(connection);
        animalDAO = new AnimalDAO(connection);
    }

    @Override
    public AnimalEnclosure save(AnimalEnclosure element) throws SQLException {
        try{
            request = "INSERT INTO Animal_Enclosure (id_animal,id_enclosure) VALUE (?,?)";
            preparedStatement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1,element.getId_animal());
            preparedStatement.setInt(2,element.getId_enclosure());
            int nbrow = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if(nbrow != 1){
                throw new SQLException();
            }
            if(resultSet.next()){
                element.setId(resultSet.getInt(1));
            }
            _connection.commit();
            return element;
        }catch(SQLException e){
            _connection.rollback();
            return null;
        }
    }

    @Override
    public AnimalEnclosure update(AnimalEnclosure element) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(AnimalEnclosure element) throws SQLException {
        return false;
    }

    @Override
    public AnimalEnclosure getAnimalByName(String animalName) throws SQLException {
        return null;
    }

    @Override
    public List<AnimalEnclosure> get() throws SQLException {
        return null;
    }


    public List<Animal> getAllAnimalsByEnclosureId (int id)throws SQLException{
        List<Animal> animals = new ArrayList<>();
        request ="SELECT a.animal_id as animalID , a.animalName as animalName, a.breed as animalBreed, a.animalDescription as animalDescription, a.habitat as animalHabitat, a.animalAge as animalAge, FROM animal AS a INNER JOIN Animal_Enclosure as e ON e.id_animal = a.animal_id WHERE e.id_enclosure = ?";
        preparedStatement = _connection.prepareStatement(request);
        preparedStatement.setInt(1,id);
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