import { configureStore } from "@reduxjs/toolkit";
import MovieSlice from "./components/Movies/MovieSlice";

export default configureStore({
    reducer: {
        movie: MovieSlice,
    }
})