import axios from "axios";
import { Pokemonmonster } from "../models/Pokemonster";


export const NB_POKEMONS = 50 


export const getInfoPokemonById = async (id) => {
    const response = await axios.get(`https://pokeapi.co/api/v2/pokemon/${id}`)
    let pokemonRecup = new Pokemonmonster(response.data.id,response.data.name,response.data.sprites.front_default,response.data.height,response.data.weight)
    return(pokemonRecup)
}