package org.example.DAO;

import org.example.Entity.Enclosure;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EnclosureDAO extends BaseDAO<Enclosure> {
    private AnimalEnclosureDAO animalEnclosureDAO;
    public EnclosureDAO(Connection connection) {
        super(connection);
        animalEnclosureDAO = new AnimalEnclosureDAO(connection);
    }

    @Override
    public Enclosure save(Enclosure element) throws SQLException {
        try{
            request = "INSERT INTO Enclosure (enclosureName) VALUE (?)";
            preparedStatement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,element.getEnclosureName());
            int nbrow = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            if(nbrow != 1){
                throw new SQLException();
            }
            if(resultSet.next()){
                element.setEnclosure_id(resultSet.getInt(1));
            }
            _connection.commit();
            return element;
        }catch(SQLException e){
            _connection.rollback();
            return null;
        }

    }

    @Override
    public Enclosure update(Enclosure element) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(Enclosure element) throws SQLException {
        return false;
    }

    @Override
    public Enclosure getAnimalByName(String animalName) throws SQLException {
        return null;
    }

    @Override
    public List<Enclosure> get() throws SQLException {
        return null;
    }
}
