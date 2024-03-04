import { useRef } from "react";
import { useNavigate, useOutletContext, useParams } from "react-router-dom";
import axios from "axios"

const FormMovie = () => {
  const {setReload, reload, movies} = useOutletContext()
  const {id} = useParams()
  const movie = id ? movies.find((movie) => movie._id == id) : null
  const formattedDate = movie ? movie.releaseDate.slice(0, 10) : ""
  const titleRef = useRef()
  const descriptionRef = useRef()
  const dateRef = useRef()
  const directorRef = useRef()
  const navigate = useNavigate()

  const handleSubmit = (e) => {
    e.preventDefault()

    const movie = {
      title: titleRef.current.value,
      description: descriptionRef.current.value,
      director: directorRef.current.value,
      releaseDate: dateRef.current.value
    }

    if(!id) {
      axios.post("http://localhost:3000/api/movies/add-movie", movie).then(() => setReload(!reload))
    } else {
      axios.put(`http://localhost:3000/api/movies/update-movie/${id}`, movie).then(() => setReload(!reload))
    }

    navigate("/")
  }

  return ( 
    <div className="container">
      <h2 className="mt-4 mb-3">{id ? "Modifier le film" : "Ajouter un film"}</h2>
      <form onSubmit={handleSubmit}>
        <div className="mb-3">
          <input type="text" className="form-control" name="title" placeholder="title" ref={titleRef} defaultValue={movie?.title} />
        </div>
        <div className="mb-3">
          <input type="text" className="form-control" name="description" placeholder="description" ref={descriptionRef} defaultValue={movie?.description} />
        </div>
        <div className="mb-3">
          <input type="text" className="form-control" name="director" placeholder="director" ref={directorRef} defaultValue={movie?.director} />
        </div>
        <div className="mb-3">
          <input type="date" className="form-control" name="releaseDate" placeholder="releaseDate" ref={dateRef} defaultValue={formattedDate} />
        </div>
        <button type="submit" className="btn btn-primary">{id ? "Modifier le film" : "Ajouter un film"}</button>
        <button type="button" className="btn btn-secondary" onClick={() => navigate("/")}>Annuler</button>
      </form>
    </div>
   );
}
 
export default FormMovie;