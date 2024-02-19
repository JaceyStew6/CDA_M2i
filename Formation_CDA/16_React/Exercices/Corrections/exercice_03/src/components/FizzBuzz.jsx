import React, { useState } from 'react';

const FizzBuzz = () => {
  const [counter, setCounter] = useState(0);

  const fizzBuzzFormatted = () => {
    if (counter % 15 === 0 && counter != 0) {
      return "FizzBuzz"
    } else if (counter % 5 === 0 && counter != 0) {
      return "buzz"
    } else if (counter % 3 === 0 && counter != 0) {
      return "Fizz"
    } else {
      return counter
    }
  }

  return ( 
    <div>
      <p>{fizzBuzzFormatted()}</p>
      <button onClick={() => setCounter(counter+1)} disabled={counter >= 30}>+</button>
      <button onClick={() => setCounter(counter-1)} disabled={counter <= 0}>-</button>
    </div>
   );
}
 
export default FizzBuzz;