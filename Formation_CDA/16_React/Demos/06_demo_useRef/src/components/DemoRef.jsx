import { useRef } from "react";

const DemoRef = () => {
  const firstnameRef = useRef()

  const getValueFromInput = () => {
    console.log(firstnameRef.current.value);
  }

  return ( 
    <>
      <label htmlFor="firstname">Firstname</label>
      <input type="text" ref={firstnameRef}/>
      <button onClick={getValueFromInput}>Valider</button>
    </>
   );
}
 
export default DemoRef;