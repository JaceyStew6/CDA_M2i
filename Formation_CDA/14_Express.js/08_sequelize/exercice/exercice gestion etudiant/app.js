const express = require("express");
const DB = require("./config/db");
const studentRoutes = require("./routes/studentRoutes");
const authRoutes = require("./routes/authRoutes");
const isAuthenticated = require("./middlewares/authentication");

const app = express();
const port = 3000;

app.use(express.json())
    .use("/api/auth", authRoutes)
    .use("/api/student",isAuthenticated, studentRoutes);

DB.sequelize
    .authenticate()
    .then(() => console.log("Connexion avec la base de données réussie"))
    .then(() => {
        app.listen(port, () => {
            console.log("http://localhost:", port);
        });
    })
    .catch((err) => {
        console.log("Erreur lors de la connexion à la base de données", err.message);
    });