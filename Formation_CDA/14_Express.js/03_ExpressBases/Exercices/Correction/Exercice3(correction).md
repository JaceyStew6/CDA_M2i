# Correction Exercice3

**1. generalRoutes.js:**

```jsx
const express = require('express');
const router = express.Router();

// Texte HTML
router.get('/bienvenue', (req, res) => {
  res.send('<h1>Bienvenue sur votre site Web Express2000</h1>');
});

// Contenu JSON
router.get('/info', (req, res) => {
  const jsonData = {
    nom: 'John Doe',
    age: 25,
    ville: 'Anytown'
  };
  res.json(jsonData);
});

// Code de statut personnalisé
router.get('/acces-interdit', (req, res) => {
  res.status(403).send('Accès interdit - Code 403');
});

// Redirection vers la page d'accueil
router.get('/redirection-accueil', (req, res) => {
  res.redirect('/');
});

// Route par défaut
router.get('*', (req, res) => {
  res.send('Bienvenue sur votre page d\'accueil Express2000');
});

module.exports = router;

```

**2. userRoutes.js:**

```jsx
const express = require('express');
const router = express.Router();
const path = require('path');
const fs = require('fs');

// Chemin vers le fichier JSON des utilisateurs
const cheminVersUsersJson = path.join(__dirname, '../data/users.json');

// Route 1 - Liste des utilisateurs
router.get('/', (req, res) => {
  // Utilisez fs.readFile pour lire le contenu du fichier JSON des utilisateurs
  fs.readFile(cheminVersUsersJson, 'utf8', (err, data) => {
    if (err) {
      console.error('Erreur lors de la lecture du fichier JSON des utilisateurs :', err);
      res.status(500).send('Erreur interne du serveur');
      return;
    }

    // Convertissez le contenu du fichier JSON en objet JavaScript
    const listeUtilisateurs = JSON.parse(data);

    // Utilisez res.json() pour envoyer la réponse au format JSON
    res.json(listeUtilisateurs);
  });
});

// Route 2 - Détails d'un utilisateur par ID
router.get('/:id', (req, res) => {
  // ... (Code pour récupérer les détails d'un utilisateur par ID)
});

// Route 3 - Ajout d'un nouvel utilisateur (simulation)
router.post('/ajout', (req, res) => {
  // ... (Code pour simuler l'ajout d'un nouvel utilisateur)
});

// Route 4 - Recherche d'utilisateurs par nom
router.get('/recherche/nom/:nom', (req, res) => {
  // ... (Code pour rechercher des utilisateurs par nom)
});

module.exports = router;
```

**3. bookRoutes.js:**

```jsx
const express = require('express');
const router = express.Router();

// Route 1 - Liste des livres
router.get('/livres', (req, res) => {
  // Logique pour la liste des livres (peut être modifiée en fonction de l'exercice 2)
  res.send('Liste des livres');
});

// Route 2 - Détails d'un livre par ID
router.get('/livres/:id', (req, res) => {
  // Logique pour récupérer les détails d'un livre par ID
  const livreId = req.params.id;
  res.send(`Détails du livre avec l'ID : ${livreId}`);
});

// Route 3 - Ajout d'un nouveau livre (simulation)
router.post('/ajout-livre', (req, res) => {
  // Logique pour simuler l'ajout d'un nouveau livre
  res.send('Nouveau livre ajouté avec succès');
});

// Route 4 - Recherche de livres par auteur
router.get('/recherche-livre/auteur/:auteur', (req, res) => {
  // Logique pour rechercher des livres par auteur
  const auteur = req.params.auteur;
  res.send(`Livres écrits par ${auteur}`);
});

module.exports = router;
```

**4. index.js:**

```jsx
const express = require('express');
const generalRoutes = require('./generalRoutes');
const bookRoutes = require('./bookRoutes');
const userRoutes = require('./userRoutes');

const router = express.Router();

// Utilisation des routeurs existants
router.use('/', generalRoutes);
router.use('/bouquins', bookRoutes);
router.use('/utilisateurs', userRoutes);

module.exports = router;

```

**5. App.js:**

```jsx
const express = require('express');
const app = express();
const routes = require('./Routes/index');

app.use(express.json()); // Si nécessaire pour traiter les données JSON

// Utilisation du routeur regroupant tous les routeurs
app.use('/', routes);

// Front-end statique
app.use(express.static('public'));

const port = 3000;
app.listen(port, () => {
  console.log(`Serveur en écoute sur le port ${port}`);
});

```

**1. views/index.html (page d'accueil) :**

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Express2000</title>
</head>
<body>
    <h1>Bienvenue sur Express2000</h1>
    <ul>
        <li><a href="/bienvenue">Page de bienvenue</a></li>
        <li><a href="/info">Informations JSON</a></li>
        <li><a href="/acces-interdit">Accès interdit</a></li>
        <li><a href="/redirection-accueil">Redirection vers la page d'accueil</a></li>
        <li><a href="/livres">Liste des livres</a></li>
        <li><a href="/livres/1">Détails du livre 1</a></li>
        <li><a href="/ajout-livre">Ajout d'un nouveau livre</a></li>
        <li><a href="/recherche-livre/auteur/John%20Doe">Recherche de livres par auteur</a></li>
        <li><a href="/utilisateurs">Liste des utilisateurs</a></li>
        <li><a href="/utilisateurs/1">Détails de l'utilisateur 1</a></li>
        <li><a href="/ajout-utilisateur">Ajout d'un nouvel utilisateur</a></li>
        <li><a href="/recherche-utilisateur/nom/John">Recherche d'utilisateurs par nom</a></li>
    </ul>
</body>
</html>

```

**2. public/style.css (feuille de style pour rendre le front-end plus attrayant) :**

```css
body {
    font-family: Arial, sans-serif;
    margin: 20px;
}

h1 {
    color: #333;
}

ul {
    list-style: none;
    padding: 0;
}

li {
    margin-bottom: 10px;
}

a {
    text-decoration: none;
    color: #007BFF;
    font-weight: bold;
}

a:hover {
    color: #0056b3;
}

```