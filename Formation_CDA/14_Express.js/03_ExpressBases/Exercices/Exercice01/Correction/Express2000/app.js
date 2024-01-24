const express = require('express');
const app = express();

// Définir le dossier public pour les fichiers statiques
app.use(express.static('public'));

// Port d'écoute
const port = 3000;
app.listen(port, () => {
  console.log(`Serveur en écoute sur le port ${port}`) 
})

// Texte HTML
app.get('/bienvenue', (req, res) => {
  res.send("<h1>Bienvenue à tous!</h1>")
});

// Contenu en JSON
app.get('/info', (req, res) => {
  const jsonData = {
    nom: "Benoit Lecoeuvre",
    age : 31,
    ville: "Lille"
  }
  res.json(jsonData)
});

// Code de statut personnalisé
app.get('/acces-interdit', (req, res) => {
  res.status(403).send("Accès interdit - Code 403");
});

// Redirection vers la page d'accueil
app.get('/redirection-accueil', (req, res) => {
  res.redirect("/");
});

// Route par défaut
app.get('*', (req, res) => {
  res.send("Oups, cette page n'existe pas");
});