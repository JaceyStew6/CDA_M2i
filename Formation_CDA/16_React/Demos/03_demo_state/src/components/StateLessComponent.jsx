import React from 'react';
import { useState } from 'react';

const StateLessComponent = () => {
  const [monPrenom, setMonPrenom] = useState("Toto")

  const changePrenom = () => {
    setMonPrenom("Titi")
  }

  return ( 
    <div>
    <h1>StateLessComponent</h1>
    <p>mon prénom : {monPrenom}</p>
    <button onClick={changePrenom}>ChangePrenom</button>
  </div>
   );
}
 
export default StateLessComponent;