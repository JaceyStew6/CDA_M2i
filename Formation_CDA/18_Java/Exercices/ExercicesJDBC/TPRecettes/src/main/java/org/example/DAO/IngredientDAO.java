package org.example.DAO;

import org.example.Entity.Ingredient;

import java.sql.*;
import java.sql.SQLException;
import java.util.List;

public class IngredientDAO extends BaseDAO<Ingredient>{

    protected IngredientDAO(Connection connection) {
        super(connection);
    }

    @Override
    public Ingredient save(Ingredient element) throws SQLException {
        try {
            request = "INSERT INTO Ingredient (ingredientName) VALUE (?)";
            preparedStatement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, element.getIngredientName());
            int nbrow = preparedStatement.executeUpdate();
            resultSet = preparedStatement.getGeneratedKeys();
            Ingredient ingredient = null;
            if (resultSet.next()){
                ingredient = Ingredient.builder().ingredientName(element.getIngredientName()).ingredient_id(resultSet.getInt(1)).build();
            }
            if (nbrow != 1){
                _connection.rollback();
            }
            _connection.commit();
            return ingredient;
        }catch(SQLException e){
            _connection.rollback();
            return null;
        }
    }

    @Override
    public Ingredient update(Ingredient element) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(Ingredient element) throws SQLException {
        return false;
    }

    @Override
    public Ingredient get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Ingredient> get() throws SQLException {
        return null;
    }
}
