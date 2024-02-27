import {Navigate, useNavigate} from "react-router-dom"

const ProtectedRoute = (props) => {
  const token = localStorage.getItem("token")

  if(token) {
    return ( 
      <>
        {props.children}
      </>
     );
  } else {
    return <Navigate to={"/login"} />
  }
}
 
export default ProtectedRoute;