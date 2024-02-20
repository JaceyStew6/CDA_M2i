import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import DemoUseEffect from './components/DemoUseEffect'
import Chrono from './components/Chrono'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <DemoUseEffect />
      <Chrono />
    </>
  )
}

export default App
