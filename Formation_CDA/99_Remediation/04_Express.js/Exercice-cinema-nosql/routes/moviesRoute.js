app.post('/movies', async (req, res) => {
    try {
        const newMovie = new User(req.body);
        await newMovie.save();
        res.status(201).json(newMovie);
    } catch (error) {
        res.status(400).json({ error: error.message });
    }
});