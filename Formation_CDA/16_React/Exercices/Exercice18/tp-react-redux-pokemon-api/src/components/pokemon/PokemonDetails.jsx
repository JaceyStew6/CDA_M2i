import { useDispatch } from "react-redux"
import { Link } from 'react-router-dom';


const PokemonDetails = (props) => {
    const dispatch = useDispatch()
    const {pokemon} = props.pokemon
    return ( 
        <div>
            <h1>{pokemon.name.fr}</h1>
        </div>
     );
}
 
export default PokemonDetails;