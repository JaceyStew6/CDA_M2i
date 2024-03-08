import React, { useEffect } from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { fetchPokemonsAction } from './pokemonSlice';
import { Link } from 'react-router-dom';

const PokemonDisplay = () => {
    // On importe le hook useSelector pour récupérer les données du store et le hook useDispatch pour dispatcher les actions.
    const dispatch = useDispatch();
    const pokemons = useSelector(state => state.pokemons.pokemons);
    const isLoading = useSelector(state => state.pokemons.isLoading);

    // On importe fetchPokemonsAction pour récupérer les pokémons de l'api.
    useEffect(() => {
        dispatch(fetchPokemonsAction());
    }, []);

    // On affiche un message de chargement si isLoading est true.
    if (isLoading) {
        return <div>Loading...</div>;
    }

    return (
        // On importe Link pour créer des liens vers les pages de détails des pokémons.
        <div className='row'>
            {/* On map sur les pokémons pour les afficher dans des cards. */}
            {pokemons.map(pokemon => (
                <div className='col-sm-3' style={{ marginBottom: '1rem', marginTop: '1rem' }} key={pokemon.pokedex_id}>
                    <Link to={`/pokemon/${pokemon.pokedex_id}`}>
                        {<div className='card' style={{ width: '20rem' }}>
                            {/* On affiche l'image, le nom et l'id du pokémon. */}
                            <img src={pokemon.sprites.regular} alt="pokemon" />
                            <p>#{pokemon.pokedex_id}</p>
                            <p>{pokemon.name.fr}</p>
                        </div>}
                    </Link>
                </div>

            ))}
        </div>
    );
};

export default PokemonDisplay;