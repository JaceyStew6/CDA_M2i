const { DataTypes } = require("sequelize");

module.exports = (sequelize) => {
    const Student = sequelize.define("Student", {
        id: {
            type: DataTypes.INTEGER,
            primaryKey: true,
            autoIncrement: true,
        },
        lastname: {
            type: DataTypes.STRING,
            allowNull: false,
        },
        firstname: {
            type: DataTypes.STRING,
            allowNull: false,
        },
    });

    return Student;
}