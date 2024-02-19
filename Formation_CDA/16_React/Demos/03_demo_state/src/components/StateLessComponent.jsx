import React from 'react';
import { useState } from 'react';

const StateLessComponent = () => {
  const [monPrenom, setMonPrenom] = useState("Toto")
  const [myText, setMyText] = useState("")

  const changePrenom = () => {
    setMonPrenom("Titi")
  }

  const textInputHandler = (event) => {
    setMyText(event.target.value)
    console.log(myText);
  }

  return ( 
    <div>
    <h1>StateLessComponent</h1>
    <p>mon prénom : {monPrenom}</p>
    <input type="text" value={myText} onInput={textInputHandler}/>
    <button onClick={changePrenom}>ChangePrenom</button>
  </div>
   );
}
 
export default StateLessComponent;