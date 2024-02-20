import { useEffect } from "react";
import { useState } from "react";

const MysteryNumber = (props) => {
  const {mysteryNumber} = props
  const [numberA, setNumberA] = useState(0)
  const [numberB, setNumberB] = useState(0)
  const [isWon, setIsWon] = useState(false)

  const numberAHandler = (e) => {
    setNumberA(+e.target.value)
  }

  const numberBHandler = (e) => {
    setNumberB(+e.target.value)
  }

  useEffect(() => {
    setIsWon(numberA * numberB === mysteryNumber)
  }, [numberA, numberB, mysteryNumber])

  return ( 
    <>
      <input type="number" value={numberA} onInput={numberAHandler}/>
      <input type="number" value={numberB} onInput={numberBHandler}/>
      <p>{isWon ? `La multiplication des deux nombres fait bien ${mysteryNumber}` : `Les deux nombres multipliés ne font pas ${mysteryNumber}`}</p>
    </>
   );
}
 
export default MysteryNumber;