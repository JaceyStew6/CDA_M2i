import React, { useEffect, useState } from 'react';


const ChildComponent = (props) => {

    let { initialValue} = props

    const [firstNumber, setFirstNumber] = useState(0)
    const [secondNumber, setSecondNumber] = useState(0)
    // const [total, setTotal] = useState(0)
    const [isWon, setIsWon]=  useState(false)

    const firstNumberHandler = (e) => {
        setFirstNumber(Number(e.target.value))
    }

    const secondNumberHandler = (e) => {
        setSecondNumber(Number(e.target.value))
    }

    useEffect(() => {
        console.log("Nouvelle multiplication");
        setIsWon(firstNumber * secondNumber === initialValue)
    }, [firstNumber, secondNumber, initialValue]) //On indique ici ce qu'on souhaite écouter


    return (
        <div>
            {/* <p>Valeur initiale: {initialValue}</p> */}
            <p>{isWon ? `La multiplication des deux nombres fait bien ${initialValue}` : `Les deux nombres multipliés ne font pas ${initialValue}` }</p>
            <input type="number" value={firstNumber} onInput={firstNumberHandler} />
            <input type="number" value={secondNumber} onInput={secondNumberHandler} />
            {/* <p>Total: {total}</p> */}
        </div>

    );
}

export default ChildComponent;