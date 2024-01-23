const express = require('express');

//Instancier l'application Express
const app = express();
const PORT = process.env.PORT || 3000;

//Test de route
app.get('/', (req, res) => {
    res.send("Bienvenue sur votre application Express!");
});

app.get("/essai", (req, res) => {
    res.send("Ceci est un essai!")
})

//Invoquer la méthode '.listen()' de l'application
app.listen(PORT, () => {
    console.log(`Serveur en écoute sur le port ${PORT}`);
});

