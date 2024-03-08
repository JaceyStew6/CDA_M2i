import { createSlice } from '@reduxjs/toolkit'

const movieSlice = createSlice({
    name: "slice",
    initialState: {
        movies: [],
    },

    reducers: {

        addMovie: (state, action) => {
            const newMovie = {
                title: action.payload.title,
                description: action.payload.description,
                director: action.payload.director,
                releaseDate: action.payload.releaseDate,
            }

            state.movies.push(newMovie);
        },

        deleteMovie: (state, action) => {
            state.movies = state.movies.filter((movies) => movies.id !== action.payload);
        },

        updateMovie: (state, action) => {
            const movie = state.movies.find(movie => movie.id === action.payload.id);
            movie.title = action.payload.title
            movie.description = action.payload.description
            movie.director = action.payload.director
            movie.releaseDate = action.payload.releaseDate
        },
    },
});

export const { addMovie, deleteMovie, updateMovie } = movieSlice.actions;
export default movieSlice.reducer;