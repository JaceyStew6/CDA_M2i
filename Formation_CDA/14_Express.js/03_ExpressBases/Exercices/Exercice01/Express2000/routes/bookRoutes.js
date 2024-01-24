const express = require("express");
const router = express.Router();
const fs = require('fs')

const bookJsonFile = require('../data/books.json');

// Créer une route qui renvoie une réponse au format JSON avec la liste des livres disponibles sur le site
router.get("/livres", (req, res) => {
    res.json(fs.readFileSync("./data/books.json", 'utf8'));
});

// Mettre en place une route qui renvoie les détails d'un livre spécifique en utilisant un paramètre d'URL
router.get('/livres/:id', (req, res) => {
    const bookId = req.params.id - 1;
    res.send(bookJsonFile[bookId]); //récupération par l'index et non pas par l'id
});

//Simmuler l'ajout d'un livre sur la route ajout-livre
router.get('/ajout-livre', (req, res) => {
    res.json({id: 3, titre: "Le sorceleur", auteur: "Andrzej Sapkowski", année_publication: "1986"})
});

//Route qui permet de rechercher des livres en fonction de l'auteur
router.get('/auteur/:auteur', (req, res) => {
    const auteurName = req.params.auteur;
    const result = bookJsonFile.filter((book) => book.auteur === auteurName);
    res.send(result);
});


module.exports = router;