import {createBrowserRouter} from "react-router-dom"
import App from "./App"
import Project from "./components/Project"

const router = createBrowserRouter([
  {
    path: "/",
    element: <App />
  },
  {
    path: "/projects/:monparams",
    element: <Project />
  }
])

export default router