const express = require('express');
const bookRoutes = require('./routes/bookRoutes.js');
const connection = require('./config/db.js');
const mongoose = require('mongoose');

//Connexion à MongoDB
mongoose.connect('mongodb://localhost:27017/Express2000_Mongo_db');

const db = mongoose.connection;

db.on('error', console.error.bind(console, 'Erreur de connexion à MongoDB :'));
db.once('open', () => {
  console.log('Connecté à MongoDB');
}); 


//Instancier l'application Express
const app = express();
const PORT = process.env.PORT || 3000;
app.use(express.static('public'));
app.use('/', bookRoutes);
app.set('view engine', 'pug') // Configuration du moteur de modèle
app.set('views'); // Spécification du répertoire des views

// Méthode 'traditionnelle'
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


// Méthode avec PUG
//Route page d'accueil avec text HTML
// app.get('/bienvenue', (req, res) => {
//   res.render('index', {title: 'bienvenue', message: 'Bienvenue sur mon site'})
// });

// //Route avec réponse au format JSON
// app.get("/info", (req, res) => {
//     res.json({firstname:'Max', lastname:'Black', age: 30});
// });

// //Route avec code statut HTTP personnalisé
// app.get('/acces-interdit', (req, res) => {
//   res.status(201).send('accès-interdit');
// });

// //Redirection vers la page d'accueil
// app.get('/redirection-accueil', (req, res) => {
//   res.redirect('/bienvenue');
// });

// //Route par défaut
// app.get('*', (req, res) => {
//   res.send('page non trouvée');
// });


//Invoquer la méthode '.listen()' de l'application
app.listen(PORT, () => {
    console.log(`Serveur en écoute sur le port ${PORT}`);
});