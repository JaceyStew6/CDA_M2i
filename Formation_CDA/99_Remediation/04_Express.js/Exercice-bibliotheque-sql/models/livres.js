const connection = require('../config/db');

class Book {
    static getAllBooks(callback) {
        connection.query('SELECT * FROM Livres', callback);
    }

    static addBook(title, author, release_year, callback) {
        connection.query('INSERT INTO Livres (title, author, release_year) VALUES (?, ?, ?)', [title, author, release_year], callback);
    }

    static updateBook(bookId, title, release_year, availability, callback) {
        connection.query('UPDATE Livres SET title = ?, WHERE id = ?', [bookId, title, release_year, availability], callback);
    }

    static deleteBook(bookId, callback) {
        connection.query('DELETE FROM Livres WHERE id = ?',bookId, callback);
    }
}

module.exports = Book;