import logo from './logo.svg';
import './App.css';
import { Link, Outlet } from "react-router-dom";

function App() {
  return (
    <div className="App">

      <nav>
        <Link to={"/"}>HomePage</Link>
        <Link to={"/user"}>UserPage</Link>
      </nav>
      <div>
        <Outlet />
      </div>
      <footer>Mon pied de page</footer>
    </div>
  );
}

export default App;
