const Livre = require("../models/Livre")

const livreController = {
    getAllBooks: (req, res) => {
        Livre.getAllBooks((err, result) => {
            if(err) throw err
            res.json(result)
        })
    },
    addBook: (req, res) => {
        const nouveauLivre = req.body
        Livre.addBook(nouveauLivre, (err, result) => {
            if(err) throw err
            res.json({message: "Livre ajouté avec succès"})
        })
    },
    updateBook: (req, res) => {
        const id = req.params.id
        const livreModifie = req.body
        Livre.updateBook(id, livreModifie, (err) => {
            if(err) throw err
            res.json({message: "Livre modifié avec succès"})
        })
    },
    deleteBook: (req, res) => {
        const id = req.params.id
        Livre.deleteBook(id, (err) => {
            if(err) throw err
            res.json({message: "Livre supprimé avec succès"})
        })
    }
}

module.exports = livreController