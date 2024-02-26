import {createBrowserRouter} from "react-router-dom"
import HomePage from "./components/HomePage"
import UserPage from "./components/UserPage"
import ErrorPage from "./components/ErrorPage"
import App from "./App"

const router = createBrowserRouter([

    {
        path: "/",
        element: <App/>,
        errorElement: <ErrorPage/>,
        children: [
            {path: '/', element: <HomePage/>},
            {path: '/user', element: <UserPage/>}
        ]
    }
])

export default router;