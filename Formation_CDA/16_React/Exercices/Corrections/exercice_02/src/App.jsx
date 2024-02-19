import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import ListingComponent from './components/ListingComponent'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <ListingComponent />
    </>
  )
}

export default App
