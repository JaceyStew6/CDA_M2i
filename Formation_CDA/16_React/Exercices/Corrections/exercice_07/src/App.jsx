import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import LoginForm from './components/LoginForm'

function App() {

  const logUserInfos = (infos) => {
    console.log(infos);
  }

  return (
    <>
      <LoginForm logUserInfos={logUserInfos} />
    </>
  )
}

export default App
