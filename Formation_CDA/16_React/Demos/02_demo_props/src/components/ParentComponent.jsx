import React from 'react';
import ChildComponent from './ChildComponent';

const ParentComponent = () => {
  let maVariable = "Toto"

  const sayHelloFromParent = () => {
    console.log("Hello from parent !");
  }

  return (
    <div>
        <h1>Parent component</h1>
        <ChildComponent maVariable={maVariable} sayHelloFromParent={sayHelloFromParent} />
    </div>
    );
}
 
export default ParentComponent;