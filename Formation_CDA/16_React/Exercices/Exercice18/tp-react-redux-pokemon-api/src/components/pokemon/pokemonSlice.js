import { createSlice, createAsyncThunk } from "@reduxjs/toolkit";
import axios from "axios";

// On récupère la data de l'api tyradex.tech pour les pokémons. On utilise createAsyncThunk pour gérer les requêtes asynchrones.
export const fetchPokemonsAction = createAsyncThunk(
    "pokemons/fetchPokemonsAction",
    async () => {
        // On utilise axios pour faire une requête get sur l'api. 
        const response = await axios.get("https://tyradex.tech/api/v1/pokemon");
        // On retourne la data de la requête.
        return response.data;
    }
);

// On crée un slice pour gérer les pokémons.
const pokemonSlice = createSlice({
    name: "pokemons",
    // On crée un initialState avec un tableau de pokémons, une erreur, un isLoading et un selectedPokemon. 
    initialState: {
        pokemons: [],
        error: null,
        isLoading: false,
        selectedPokemon: null,
    },
    // On crée un reducer pour gérer les pokémons. 
    reducers: {},
    // On crée un extraReducers pour gérer les requêtes asynchrones.
    extraReducers: (builder) => {
        // On ajoute un case pour gérer le pending, le fulfilled et le rejected de la requête asynchrone. 
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

// On exporte le reducer.
export default pokemonSlice.reducer;