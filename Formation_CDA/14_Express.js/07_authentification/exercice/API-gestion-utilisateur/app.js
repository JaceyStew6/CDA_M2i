const express = require("express");
const mongoose = require("mongoose");
const bookRoutes = require("./routes/bookRoutes");
const authRoutes = require("./routes/authentication");
const isAuthenticated = require("./middlewares/authentification");
const path = require("path");

const app = express();
const port = 3000;

mongoose.connect("mongodb://localhost:27017/library_db");
const db = mongoose.connection;

db.on("error", console.error.bind(console, "Erreur de connexion à mongoDB"));
db.once("open", () => {
    console.log("Connecté à mongoDB");
});

app
    .use(express.json())
    .use("/authentication", authRoutes)
    .use("/", isAuthenticated, bookRoutes);
    // .use("/", bookRoutes);

app.get("/acces-interdit", (req, res) => {
    res.status(403).send("Accès interdit - Code 403");
});

app.get("*", (req, res) => {
    res.send("Cette route n'existe pas");
});

app.listen(port, () => {
    console.log(`http://localhost:${port}`);
});
