import { useParams } from "react-router-dom"
import { useSelector } from "react-redux"


const PokemonDetails = () => {

    const { pokedex_id } = useParams()
    const pokemons = useSelector(state => state.pokemons.pokemons);

    const pokemon = pokemons.find(pokemon => pokemon.pokedex_id === parseInt(pokedex_id));

    return (
        <div>
            <div className="row">
                <div className='card col'>
                    <p>{pokemon.name.fr}</p>
                    <img src={pokemon.sprites.regular} alt="pokemon" style={{ width: '20rem' }} />
                    <button className="btn btn-light" style={{width: '15rem'}}>Ajouter au Pokedex</button>
                </div>
                <div className='card col'>
                    <p>#{pokemon.pokedex_id}</p>
                    <p>height: {pokemon.height}</p>
                    <p>weight: {pokemon.weight}</p>
                    <div>
                        <h3>Type</h3>
                        {pokemon.types?.map(type => <span key={type.name}><img src={type.image} alt="typeimage" />{type.name}</span>)}
                    </div>
                </div>

                <div className='card' style={{ width: '15rem', height: '20rem' }}>
                    <h2>Stats</h2>
                    <p>hp: {pokemon.stats.hp}</p>
                    <div className="progress">
                        <div className="progress-bar" role="progressbar" style={{ width: `${pokemon.stats.hp}%` }} aria-valuenow={pokemon.stats.hp} aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                    <p>atk: {pokemon.stats.atk}</p>
                    <div className="progress">
                        <div className="progress-bar" role="progressbar" style={{ width: `${pokemon.stats.atk}%` }} aria-valuenow={pokemon.stats.atk} aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                    <p>def: {pokemon.stats.def}</p>
                    <div className="progress">
                        <div className="progress-bar" role="progressbar" style={{ width: `${pokemon.stats.def}%` }} aria-valuenow={pokemon.stats.def} aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                    <p>spe_atk: {pokemon.stats.spe_atk}</p>
                    <div className="progress">
                        <div className="progress-bar" role="progressbar" style={{ width: `${pokemon.stats.spe_atk}%` }} aria-valuenow={pokemon.stats.spe_atk} aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                    <p>spe_def: {pokemon.stats.spe_def}</p>
                    <div className="progress">
                        <div className="progress-bar" role="progressbar" style={{ width: `${pokemon.stats.spe_def}%` }} aria-valuenow={pokemon.stats.spe_def} aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                    <p>vit: {pokemon.stats.vit}</p>
                    <div className="progress">
                        <div className="progress-bar" role="progressbar" style={{ width: `${pokemon.stats.vit}%` }} aria-valuenow={pokemon.stats.vit} aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default PokemonDetails;