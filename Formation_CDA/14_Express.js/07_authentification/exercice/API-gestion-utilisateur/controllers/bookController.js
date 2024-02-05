const Book = require("../models/book");

const bookController = {
    addBook: async (req, res) => {
        try {
            const newBook = new Book(req.body);
            await newBook.save();
            res.status(201).json(newBook);
        } catch (error) {
            res.status(400).json({ error: error.message });
        }
    },

    getAllBooks: async (req, res) => {
        try {
            const books = await Book.find();
            res.json(books);
        } catch (error) {
            res.status(500).json({ error: error.message });
        }
    },

    getBookByTitle: async (req, res) => {
        try {
            const book = await Book.findOne({ title: req.params.title });
            if (!book) {
                return res.status(404).json({ message: "Livre non trouvé." });
            }
            res.json(book);
        } catch (error) {
            res.status(500).json({ error: error.message });
        }
    },

    updateBook: async (req, res) => {
        try {
            const updatedBook = await Book.findByIdAndUpdate(
                req.params.id,
                req.body,
                { new: true }
            );
            if (!updatedBook) {
                return res.status(404).json({ message: "Livre non trouvé." });
            }

            res.json(updatedBook);
        } catch (error) {
            res.status(500).json({ error: error.message });
        }
    },

    deleteBook: async (req, res) => {
        try {
            const deletedBook = await Book.findByIdAndDelete(req.params.id);
            if (!deletedBook) {
                return res.status(404).json({ message: "Livre non trouvé." });
            }
            res.json({ message: "Livre supprimé !" });
        } catch (error) {
            res.status(500).json({ error: error.message });
        }
    },
};

module.exports = bookController;
