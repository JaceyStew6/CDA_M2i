import { useEffect, useState } from "react";

const DemoUseEffect = () => {
  const [firstname, setFirstname] = useState("")
  const [lastname, setLastname] = useState("")
  const [fullname, setFullname] = useState("")

  const firstnameHandler = (e) => {
    setFirstname(e.target.value)
  }

  const lastnameHandler = (e) => {
    setLastname(e.target.value)
  }

  // L'effet est exécuté au lancement de l'application
  useEffect(() => {
    console.log("Application démarrée !");
  }, [])

  // L'effet est exécuté chaque fois que firstname ou lastname change d'état
  useEffect(() => {
    console.log("changement d'état !");
    setFullname(firstname + " " + lastname)
  }, [firstname, lastname])
  
  return ( 
    <div>
      <input type="text" value={firstname} onInput={firstnameHandler} />
      <input type="text" value={lastname} onInput={lastnameHandler} />
      <p>{fullname}</p>
    </div>
   );
}
 
export default DemoUseEffect;