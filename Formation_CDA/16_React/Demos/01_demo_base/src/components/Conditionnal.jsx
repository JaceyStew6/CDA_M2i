const Conditionnal = () => {
  let age = 15
  let monPrenom = "Toto"

  if (age >= 18) {
    return ( 
      <>
        <p>Bonjour, je suis {monPrenom} j'ai {age} ans</p>
      </>
     );
  } else {
    return (
      <>
        <p>Bonjour, j'ai moins de 18 ans</p>
      </>
    )
  }
}
 
export default Conditionnal;