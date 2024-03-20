import { createSlice, createAsyncThunk } from "@reduxjs/toolkit";
import axios from "axios";

// On récupère la data de l'api pokeapi pour les pokémons. On utilise createAsyncThunk pour gérer les requêtes asynchrones.
export const getPokemons = createAsyncThunk(
    "pokemons/getPokemons",
    async () => {
        // On utilise axios pour faire une requête get sur l'api. 
        const response = await axios.get('https://pokeapi.co/api/v2/pokemon?limit=50&offset=0');
        // On retourne la data de la requête.
        return response.data;
    }
);
// function getPokemons() {
//     axios.get('https://pokeapi.co/api/v2/pokemon?limit=160&offset=0')
//     .then(response => setContacts(response.data))
//     .catch(error => console.error(error))
// }

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
            .addCase(getPokemons.pending, (state) => {
                state.isLoading = true;
                state.error = null;
                state.pokemons = [];
            })
            .addCase(getPokemons.fulfilled, (state, action) => {
                state.isLoading = false;
                state.pokemons = action.payload;
                state.next = action.payload.next;
            })
            .addCase(getPokemons.rejected, (state, action) => {
                state.isLoading = false;
                state.error = action.error.message;
            });
    }
});

// On exporte le reducer.
export default pokemonSlice.reducer;