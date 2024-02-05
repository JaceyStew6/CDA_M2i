# Correction Exercice2

Assurez-vous d'avoir le fichier `livres.json` avec la liste de livres dans le répertoire `data` de votre projet.

**Routes/bookRoutes.js :**

```jsx
const express = require('express');
const router = express.Router();
const path = require('path');
const fs = require('fs');

// Chemin vers le fichier JSON des livres
const cheminVersLivresJson = path.join(__dirname, '../data/livres.json');

// Route 1 - Liste des livres
router.get('/livres', (req, res) => {
  // Utilisez fs.readFile pour lire le contenu du fichier JSON
  fs.readFile(cheminVersLivresJson, 'utf8', (err, data) => {
    if (err) {
      console.error('Erreur lors de la lecture du fichier JSON :', err);
      res.status(500).send('Erreur interne du serveur');
      return;
    }

    // Convertissez le contenu du fichier JSON en objet JavaScript
    const listeLivres = JSON.parse(data);

    // Utilisez res.json() pour envoyer la réponse au format JSON
    res.json(listeLivres);
  });
});

// Route 2 - Détails d'un livre par ID
router.get('/livres/:id', (req, res) => {
  // ... (Code pour récupérer les détails d'un livre par ID)
});

// Route 3 - Ajout d'un nouveau livre (simulation)
router.post('/ajout-livre', (req, res) => {
  // ... (Code pour simuler l'ajout d'un nouveau livre)
});

// Route 4 - Recherche de livres par auteur
router.get('/recherche-livre/auteur/:auteur', (req, res) => {
  // ... (Code pour rechercher des livres par auteur)
});

module.exports = router;

```

**App.js :**

```jsx
const express = require('express');
const app = express();
const bookRoutes = require('./Routes/bookRoutes');

app.use(express.json()); // Permet de traiter les requêtes JSON

// Utilisez le routeur bookRoutes pour gérer les fonctionnalités liées aux bouquins
app.use('/bouquins', bookRoutes);

// Front-end statique
app.use(express.static('public'));

const port = 3000;
app.listen(port, () => {
  console.log(`Serveur en écoute sur le port ${port}`);
});

```

**public/index.html (Modifié) :**

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Express2000 Exercise</title>
</head>
<body>

  <h1>Express2000 Exercise</h1>

  <ul>
    <!-- Routes de l'exercice précédent -->
    <li><a href="/bienvenue" target="_blank">Texte HTML</a></li>
    <li><a href="/info" target="_blank">Contenu JSON</a></li>
    <li><a href="/acces-interdit" target="_blank">Code de statut personnalisé</a></li>
    <li><a href="/redirection-accueil" target="_blank">Redirection vers la page d'accueil</a></li>

    <!-- Nouvelles routes pour les bouquins -->
    <li><a href="/bouquins/livres" target="_blank">Liste des Livres</a></li>
    <li><a href="/bouquins/livres/1" target="_blank">Détails du Livre 1</a></li>
    <li><a href="/bouquins/ajout-livre" target="_blank">Ajout d'un Livre</a></li>
    <li><a href="/bouquins/recherche-livre/auteur/Auteur1" target="_blank">Recherche par Auteur</a></li>
  </ul>

</body>
</html>

```