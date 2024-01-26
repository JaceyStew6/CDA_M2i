const express = require('express');
const router = express.Router();
const bookController = require('../controllers/livreController');

router.get('/', bookController.getAllBooks);
router.post('/', bookController.addBook);
router.put('/:id', bookController.updateBook);
router.delete('/:id', bookController.deleteBook);

module.exports = router;