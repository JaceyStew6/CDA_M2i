import {createBrowserRouter} from "react-router-dom"
import NavBar from "./components/NavBar"
import DisplayMovie from "./components/DisplayMovie"
import FormMovie from "./components/FormMovie"

const router = createBrowserRouter([
  {
    path: "/",
    element: <NavBar />,
    children: [
      {
        path: "/",
        element: <DisplayMovie />
      },
      {
        path: "/add-movie",
        element: <FormMovie />
      },
      {
        path: "/edit-movie/:id",
        element: <FormMovie />
      }
    ]
  }
])

export default router