import React, { useState } from 'react';

const HelloComponent = () => {
  const [firstname, setFirstname] = useState("")
  const [lastname, setLastname] = useState("")

  const firstnameInputHandler = (event) => {
    setFirstname(event.target.value)
  }

  const lastnameInputHandler = (event) => {
    setLastname(event.target.value)
  }

  const getFullName = () => {
    const formattedLastname = lastname.toUpperCase()

    return firstname + " " + formattedLastname
  } 

  return ( 
    <div>
      <div>
        <label htmlFor="firstname">Firstname :</label>
        <input type="text" value={firstname} onInput={firstnameInputHandler}/>
      </div>
      <div>
        <label htmlFor="lastname">Lastname :</label>
        <input type="text" value={lastname} onInput={lastnameInputHandler}/>
      </div>
      <hr />
      <p>Bonjour, <b>{getFullName()}</b>, merci d'être sur l'application</p>
    </div>
   );
}
 
export default HelloComponent;