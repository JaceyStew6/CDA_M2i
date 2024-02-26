import {useParams, useSearchParams} from "react-router-dom"

const Project = () => {
  const {monparams} = useParams()
  const [searchParams, setSearchParams] = useSearchParams()

  const mode = searchParams.get("mode") ?? "defaut"
  const toto = searchParams.get("toto") ?? 0

  return (  
    <>
      <h1>Ma page Projet n°{monparams}</h1>
      <p>mode = {mode}</p>
      <p>toto = {toto}</p>
    </>
  );
}
 
export default Project;