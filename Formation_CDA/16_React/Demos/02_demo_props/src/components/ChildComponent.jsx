import React from 'react';

const ChildComponent = (props) => {
  // let maVariable = props.maVariable
  // let sayHelloFromParent = props.sayHelloFromParent

  let {maVariable, sayHelloFromParent} = props

  const sayHello = () => {
    console.log("Hello");
    sayHelloFromParent()
  }

  return (  
    <div>
      <h1>ChildComponent</h1>
      <p>ma variable : {maVariable}</p>
      <button onClick={sayHello}>Click here !</button>
    </div>
  );
}
 
export default ChildComponent;