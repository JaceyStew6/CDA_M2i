const Sequelize = require("sequelize");

const sequelize = new Sequelize("ecole_bdd", "root", "Starbucks@6", {
    host: "localhost",
    dialect: "mysql",
});

// SYnchronisation des modèles

const User = require("../models/User")(sequelize);
const Student = require("../models/Student")(sequelize);

sequelize
    .sync({ force: false })
    .then(() => console.log("La base de données a bien été synchronisée"))
    .catch((error) =>
        console.error("Problème lors de la synchronisation :", error.message)
);

module.exports = {
    sequelize,
    User,
    Student,
};