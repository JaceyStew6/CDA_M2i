# Correction exercice 1

## Back (app.js)

```jsx
const express = require('express');
const app = express();

// Définir le dossier public pour les fichiers statiques
app.use(express.static('public'));

// Texte HTML
app.get('/bienvenue', (req, res) => {
  res.send('<h1>Bienvenue sur votre site Web Express2000</h1>');
});

// Contenu JSON
app.get('/info', (req, res) => {
  const jsonData = {
    nom: 'John Doe',
    age: 25,
    ville: 'Anytown'
  };
  res.json(jsonData);
});

// Code de statut personnalisé
app.get('/acces-interdit', (req, res) => {
  res.status(403).send('Accès interdit - Code 403');
});

// Redirection vers la page d'accueil
app.get('/redirection-accueil', (req, res) => {
  res.redirect('/');
});

// Route par défaut
app.get('*', (req, res) => {
  res.send('Oups, cette page n\'existe pas encore...');
});

// Port d'écoute
const port = 3000;
app.listen(port, () => {
  console.log(`Serveur en écoute sur le port ${port}`);
});
```

## Front

```jsx
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
    <li><a href="/bienvenue" target="_blank">Texte HTML</a></li>
    <li><a href="/info" target="_blank">Contenu JSON</a></li>
    <li><a href="/acces-interdit" target="_blank">Code de statut personnalisé</a></li>
    <li><a href="/redirection-accueil" target="_blank">Redirection vers la page d'accueil</a></li>
    <li><a href="/une-url-inexistante" target="_blank">Test de page non trouvée</a></li>
  </ul>

</body>
</html>
```