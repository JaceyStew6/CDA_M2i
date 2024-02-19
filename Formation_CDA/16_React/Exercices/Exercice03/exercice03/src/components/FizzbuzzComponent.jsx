import React from 'react';
import { useState } from 'react';
import classes from "./FizzbuzzComponent.module.css"


const FizzbuzzComponent = () => {

    const [number, setNumber] = useState(0)

    //Fonction permettant d'incrémenter de 1
    const increaseNumber = () => {
        setNumber(number + 1)
    }

    //Fonction permettant de décrémenter de 1
    const decreaseNumber = () => {
        setNumber(number - 1)
    }

    //Fonction permettant de vérifier si un nombre est un multiple de 3, 5 ou les deux et d'afficher un résultat en conséquence
    function fizzOrBuzz(number) {
        if (number % 3 === 0 && number % 5 === 0 && number != 0) {
            return "FizzBuzz";
        } else if (number % 3 === 0 && number != 0) {
            return "Fizz";
        } else if (number % 5 === 0 && number != 0) {
            return "Buzz";
        }
    }

    return (
        <div>

            <p>Nombre actuel: {number}</p>
            <button disabled={number <= 0} onClick={decreaseNumber}>-</button>
            <button disabled={number >= 100} onClick={increaseNumber}>+</button>
            <p>{fizzOrBuzz(number)}</p>
            <br />
            <div className={classes.helper}>
                <p>Fizz si multiple de 3</p>
                <p>Buzz si multiple de 5</p>
                <p>FizzBuzz si multiple de 3 et 5</p>
            </div>

        </div>

    );
}

export default FizzbuzzComponent;