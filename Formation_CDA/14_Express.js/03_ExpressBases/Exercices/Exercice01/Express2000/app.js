const express = require('express');
const bookRoutes = require('./routes/bookRoutes.js')

//Instancier l'application Express
const app = express();
const PORT = process.env.PORT || 3000;
app.use(express.static('public'));
app.use('/', bookRoutes);


//Route page d'accueil avec text HTML
app.get('/bienvenue', (req, res) => {
    res.send("Bienvenue sur l'application");
});

//Route avec réponse au format JSON
app.get("/info", (req, res) => {
    res.json({firstname:'Max', lastname:'Black', age: 30});
});

//Route avec code statut HTTP personnalisé
app.get('/acces-interdit', (req, res) => {
  res.status(201).send('accès-interdit');
});

//Redirection vers la page d'accueil
app.get('/redirection-accueil', (req, res) => {
  res.redirect('/bienvenue');
});

//Route par défaut
app.get('*', (req, res) => {
  res.send('page non trouvée');
});

//Invoquer la méthode '.listen()' de l'application
app.listen(PORT, () => {
    console.log(`Serveur en écoute sur le port ${PORT}`);
});