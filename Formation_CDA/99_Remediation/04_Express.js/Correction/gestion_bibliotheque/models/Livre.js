const mysql = require("mysql2")
const connection = require("../config/db")

const Livre = {
    getAllBooks: (callback) => {
        connection.query("SELECT * FROM livres", callback)
    },
    addBook: (nouveauLivre, callback) => {
        connection.query("INSERT INTO livres SET ?", [nouveauLivre], callback)
    },
    updateBook: (id, livreModifie, callback) => {
        connection.query(
            "UPDATE livres SET ? WHERE id = ?",
            [livreModifie, id],
            callback
        )
    },
    deleteBook: (id, callback) => {
        connection.query("DELETE FROM livres WHERE id = ?", [id], callback)
    }
}

module.exports = Livre