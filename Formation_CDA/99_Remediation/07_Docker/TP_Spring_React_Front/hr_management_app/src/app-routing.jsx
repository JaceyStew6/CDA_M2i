import { createBrowserRouter } from "react-router-dom";
import App from "./App";
import CandidateDetails from "./components/candidate/CandidateDetails";
import CandidateList from "./components/candidate/CandidateList";

const router = createBrowserRouter([
    {
        path: "/",
        element: <App/>,
        children: [
            {
                path: "/",
                element: <CandidateList/>
            },
            {
                path: "/candidates",
                element: <CandidateList/>
            },
            {
                path: "candidates/:candidate_id",
                element: <CandidateDetails/>
            },
        ]
    }
])

export default router