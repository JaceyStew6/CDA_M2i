const mongoose = require('mongoose');

const movieScheme = new mongoose.Schema({
    title: { type: String, required: true, unique: true },
    description: { type: String, required: true },
    director: { type: String, required: true },
    releaseDate: { type: Date, required: true }
});

const Movies = mongoose.model('movies', movieScheme);