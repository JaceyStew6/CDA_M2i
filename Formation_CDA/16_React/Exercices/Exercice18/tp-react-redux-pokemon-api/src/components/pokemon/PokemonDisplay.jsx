import React, { useEffect } from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { fetchPokemonsAction } from './pokemonSlice';
import { Link } from 'react-router-dom';
import PokemonDetails from './PokemonDetails';

const PokemonDisplay = () => {
    const dispatch = useDispatch();
    const pokemons = useSelector(state => state.pokemons.pokemons);
    const isLoading = useSelector(state => state.pokemons.isLoading);

    useEffect(() => {
        dispatch(fetchPokemonsAction());
    }, []);

    if (isLoading) {
        return <div>Loading...</div>;
    }


    return (

        <div className='row'>
            {pokemons.map(pokemon => (
                <div className='col-sm-3' style={{ marginBottom: '1rem', marginTop: '1rem' }} key={pokemon.pokedex_id}>
                    <Link to={`/pokemon/${pokemon.pokedex_id}`}>
                        <div className='card' style={{ width: '20rem' }}>
                            <img src={pokemon.sprites.regular} alt="pokemon" />
                            <p>#{pokemon.pokedex_id}</p>
                            <p>{pokemon.name.fr}</p>
                        </div>
                    </Link>
                </div>

            ))}
        </div>
    );
};

export default PokemonDisplay;