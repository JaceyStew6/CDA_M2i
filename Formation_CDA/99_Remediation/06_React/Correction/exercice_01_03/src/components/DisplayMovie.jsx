import { useEffect } from "react";
import { useOutletContext, Link } from "react-router-dom";
import axios from "axios"

const DisplayMovie = () => {
  const {setMovies, searchTitle, setSearchTitle, reload, setReload} = useOutletContext()

  useEffect(() => {
    axios.get("http://localhost:3000/api/movies").then((response) => {
      console.log(response.data);
      setMovies(response.data)
      setSearchTitle(response.data)
    })
  }, [reload])

  const deleteMovie = (id) => {
    axios.delete(`http://localhost:3000/api/movies/delete-movie/${id}`).then(() => setReload(!reload))
  }

  return ( 
    <div className="container">
      <h2 className="mt-4 mb-3">Liste des films</h2>
      <div className="row row-cols-1 row-cols-md-3 g-4">
        {
          searchTitle.map((movie) => (
            <div className="col" key={movie._id}>
              <div className="card h-100">
                <div className="card--body">
                  <h5 className="card-title">{movie.title}</h5>
                  <p className="card-text">{movie.description}</p>
                  <p className="card-text">{movie.releaseDate.slice(0, 10)}</p>
                  <p className="card-text">Réalisateur : {movie.director}</p>
                </div>
                <div className="card-footer bg-transparent vorder-top-0">
                  <Link to={`/edit-movie/${movie._id}`} className="btn btn-primary">Modifer</Link>
                  <button className="btn btn-secondary" onClick={() => deleteMovie(movie._id)} >Supprimer</button>
                </div>
              </div>
            </div>
          ))
        }
      </div>
    </ div>
   );
}
 
export default DisplayMovie;