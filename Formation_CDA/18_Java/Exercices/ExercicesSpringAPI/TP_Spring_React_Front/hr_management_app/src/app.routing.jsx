import { createBrowserRouter } from "react-router-dom";
import App from "./App";
import CandidateDetails from "./components/candidate/CandidateDetails";
import CandidateDisplay from "./components/candidate/CandidateDisplay";

const router = createBrowserRouter([
    {
        path: "/",
        element: <App/>,
        children: [
            {
                path: "/candidates",
                element: <CandidateDisplay/>
            },
            {
                path: "candidates/:candidate_id",
                element: <CandidateDetails/>
            },
        ]
    }
])

export default router