const express = require('express');
const bodyParser = require('body-parser');
const bookRoutes = require('./routes/livreRoutes')
const app = express();
const port = 3000;

app.use(bodyParser.json());

// Utiliser le routeur pour gérer les routes livres
app.use('/api/livres', bookRoutes)

app.listen(port, () => {
    console.log(`Serveur écoutant sur le port ${port}`)
});