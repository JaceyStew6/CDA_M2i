import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Modal from './components/Modal/Modal'
import Login from './components/Login'


function App() {
  const [isOpen, setIsOpen] = useState(false)

  return (
    <>
      <h1>Bienvenue sur mon site</h1>
      <button onClick={() => setIsOpen(!isOpen)}>Connexion</button>
      {/* && => Utilisé pour conditionner l'affichage en fonction si l'opérande de gauche est true ou false */}
      {isOpen && <Modal closeModal={() => setIsOpen(!isOpen)}><Login/></Modal>}
    </>
  )
}

export default App
