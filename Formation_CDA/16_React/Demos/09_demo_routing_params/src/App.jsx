import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import {Link} from "react-router-dom"
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Link to={"/projects/123"}>Aller projet 123</Link>
      <Link to={"/projects/1?mode=1&toto=2"}>Aller projet 1</Link>
      <Link to={"/projects/150?toto=2"}>Aller projet 150</Link>
      <Link to={"/projects/toto"}>Aller projet toto</Link>
    </>
  )
}

export default App
