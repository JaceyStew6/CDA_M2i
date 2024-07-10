import './App.css'
import NavBar from './components/shared/NavBar'
import {Outlet} from 'react-router-dom'


function App() {
  <div>
    <header>
      <NavBar/>
    </header>
    <main className='container'>
      <Outlet/>
    </main>
  </div>
  
}

export default App;
