import { configureStore } from '@reduxjs/toolkit'
import pokemonSlice from './components/pokemon/pokemonSlice'


const store = configureStore({
    reducer: {
        pokemons: pokemonSlice,
    }
})

export default store