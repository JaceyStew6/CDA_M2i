const Book = require('../models/livres')


const bookController = {
    getAllBooks: (req, res) => {
        Book.getAllBooks((err, result) => {
            if (err) throw err;
            res.json(result);
        });
    },

    addBook: (req, res) => {
        const { title, author, release_year } = req.body;
        Book.addBook(title, author, release_year, (err, result) => {
            if (err) throw err;
            res.send(`Livre ${Book.title} ajouté avec succès`);
        });
    },

    updateBook: (req, res) => {
        const title = req.body;
        const bookId = req.params.id;
        Book.updateBook(bookId, title, (err, result) => {
            if (err) throw err;
            res.send('Livre', result, 'mis à jour avec succès');
        })
    },

    deleteBook: (req, res) => {
        const bookId = req.params.id;
        Book.deleteBook(bookId, (err, result) => {
            if (err) throw err;
            res.send('Livre', result, 'supprimé avec succès');
        });
    },
};

module.exports = bookController;