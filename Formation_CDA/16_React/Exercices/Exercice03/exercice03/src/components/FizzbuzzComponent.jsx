import React from 'react';
import { useState } from 'react';
import classes from "./FizzbuzzComponent.module.css"


const FizzbuzzComponent = () => {

    const [number, setNumber] = useState(0)

    const increaseNumber = () => {
        setNumber(number + 1)
    }

    const decreaseNumber = () => {
        setNumber(number - 1)
    }


    function fizzOrBuzz(number) {
        if (number % 3 === 0 && number % 5 === 0 && number != 0) {
            return "FizzBuzz";
        } else if (number % 3 === 0 && number != 0) {
            return "Fizz";
        } else if (number % 5 === 0 && number != 0) {
            return "Buzz";
        } else {
            return number;
        }

    }

    return (
        <div>
            <p>{fizzOrBuzz(number)}</p>
            <button disabled={number == 0} onClick={decreaseNumber}>Moins</button>
            <button disabled={number == 100} onClick={increaseNumber}>Plus</button>
            <p>Nombre actuel: {number}</p>
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