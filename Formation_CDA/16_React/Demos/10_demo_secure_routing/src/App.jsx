import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { Link } from 'react-router-dom'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Link to={"/compte"}>Mon compte</Link>
      <Link to={"/login"}>Connexion</Link>
    </>
  )
}

export default App
