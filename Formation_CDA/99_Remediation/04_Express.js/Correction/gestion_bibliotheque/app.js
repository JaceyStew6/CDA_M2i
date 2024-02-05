const express = require("express")
const bodyParser = require("body-parser")
const livreRoutes = require("./routes/LivreRoutes")

const app = express()
const port = 3000

app
    .use(bodyParser.json())
    .use('/api/livres', livreRoutes)

app.listen(port, () => {
    console.log(`http://localhost:${port}`);
})