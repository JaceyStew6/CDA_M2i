const express = require("express");
const bookController = require("../controllers/bookController");
const path = require("path");
const fs = require("fs");
const isAuthenticated = require("../middlewares/authentification");

const router = express.Router();

router.get("/book", bookController.getAllBooks);
router.get("/book/:title", bookController.getBookByTitle);
router.post("/add-book", isAuthenticated, bookController.addBook);
router.put("/update-book/:id", bookController.updateBook);
router.delete("/delete-book/:id", bookController.deleteBook);


// const dataBooks = path.join(__dirname, "../data/books.json");

// const fileContent = fs.readFile(dataBooks, "utf8", (err, data) => {
//     if (err) {
//         console.error("Erreur lors de la lecture du fichier JSON :", err);
//         return;
//     }
//     return JSON.parse(data);
// });

// router.get("/livres", (req, res) => {

//     fs.readFile(dataBooks, "utf8", (err, data) => {
//         if (err) {
//             console.error("Erreur lors de la lecture du fichier JSON :", err);
//             res.status(500).send("Erreur interne au serveur");
//             return;
//         }
//         const listeLivres = JSON.parse(data);

//         res.json(listeLivres);
//     });
// });

// router.get("/livres/:id", (req, res) => {
//     const livreId = req.params.id;
//     const detailsLivre = JSON.parse(fs);
//     res.json();
// });

module.exports = router;