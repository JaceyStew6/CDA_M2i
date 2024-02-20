import logo from './logo.svg';
import './App.css';
import LoginComponent from './components/LoginComponent';
import { useRef } from 'react';

function App() {

  const getValuesFromInputs = (usernameRef, passwordRef) => {
      console.log("username: " + usernameRef + " password: " + passwordRef);
  }

  return (
    <div className="App">
      <LoginComponent getValuesFromInputs={getValuesFromInputs}/>
    </div>
  );
}

export default App;
