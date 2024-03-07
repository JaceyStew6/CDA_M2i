import { createSlice, createAsyncThunk } from "@reduxjs/toolkit";
import axios from "axios";

export const fetchPokemonsAction = createAsyncThunk(
    "pokemons/fetchPokemonsAction",
    async () => {
        const response = await axios.get("https://tyradex.tech/api/v1/pokemon");
        return response.data;
    }
);

const pokemonSlice = createSlice({
    name: "pokemons",
    initialState: {
        pokemons: [],
        error: null,
        isLoading: false,
        selectedPokemon: null,
    },
    reducers: {},
    extraReducers: (builder) => {
        builder
            .addCase(fetchPokemonsAction.pending, (state) => {
                state.isLoading = true;
                state.error = null;
                state.pokemons = [];
            })
            .addCase(fetchPokemonsAction.fulfilled, (state, action) => {
                state.isLoading = false;
                state.pokemons = action.payload;
            })
            .addCase(fetchPokemonsAction.rejected, (state, action) => {
                state.isLoading = false;
                state.error = action.error.message;
            });
    }
    });


export default pokemonSlice.reducer;