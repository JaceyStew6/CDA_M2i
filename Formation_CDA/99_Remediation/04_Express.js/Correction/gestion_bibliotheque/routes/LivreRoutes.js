const express = require('express')
const livreController = require('../controllers/livreController')

const router = express.Router();

router.get("/", livreController.getAllBooks)
router.post('/add-books', livreController.addBook)
router.put("/update/:id", livreController.updateBook)
router.delete("/delete/:id", livreController.deleteBook)

module.exports = router