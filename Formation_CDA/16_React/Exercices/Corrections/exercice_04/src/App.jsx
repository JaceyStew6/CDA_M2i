import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import HelloComponent from './components/HelloComponent'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <HelloComponent />
    </>
  )
}

export default App
