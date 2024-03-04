import { useRef, useState } from "react";
import { Link, Outlet } from "react-router-dom";

const NavBar = () => {
  const [movies, setMovies] = useState([])
  const [searchTitle, setSearchTitle] = useState([])
  const [reload, setReload] = useState(false)
  const searchInputRef = useRef()


  const handleSearch = () => {
    const searchMovie = searchInputRef.current.value.toLowerCase()
    setSearchTitle(movies.filter((movie) => movie.title.toLowerCase().includes(searchMovie)))
  }
  return ( 
    <>
      <nav className="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
        <div className="container-fluid">
          <h1 className="navbar-brand">Gestion de films</h1>
          <div className="collapse navbar-collapse">
            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
              <li className="nav-item"><Link to={"/"} className="nav-link">Page d'accueille</Link></li>
              <li className="nav-item"><Link to={"/add-movie"} className="nav-link">Ajouter un film</Link></li>
            </ul>
            <form className="d-flex">
              <input type="text" className="form-control me-2" placeholder="rechercher un film ..." ref={searchInputRef} onChange={handleSearch} />
            </form>
          </div>
        </div>
      </nav>
      <main>
        <Outlet context={{movies, setMovies, searchTitle, setSearchTitle, reload, setReload, searchInputRef}} />
      </main>
    </>
   );
}
 
export default NavBar;