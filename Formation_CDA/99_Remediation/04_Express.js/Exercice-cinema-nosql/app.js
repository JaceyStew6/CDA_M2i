const express = require('express');
const mongoose = require('mongoose');
// const bodyParser = require('body-parser'); // Pour traiter les données POST
// const User = require('./user'); // Importer le modèle User
const app = express();
const port = 3000;

// app.use(bodyParser.json());

// Connexion à MongoDB
mongoose.connect('mongodb://localhost:27017/cinema_bdd', {
    useNewUrlParser: true,
    useUnifiedTopology: true,
});

const db = mongoose.connection;

db.on('error', console.error.bind(console, 'Erreur de connexion à MongoDB :'));
db.once('open', () => {
    console.log('Connecté à MongoDB');
});

app.listen(port, () => {
    console.log(`Server is listening at <http://localhost>:${port}`);
});