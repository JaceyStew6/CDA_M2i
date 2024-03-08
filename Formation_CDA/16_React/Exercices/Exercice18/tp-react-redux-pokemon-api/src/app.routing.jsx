import { createBrowserRouter } from "react-router-dom";
import App from "./App";
import PokemonDetails from "./components/pokemon/PokemonDetails";
import PokemonDisplay from "./components/pokemon/PokemonDisplay";

const router = createBrowserRouter([
    {
        path: "/",
        element: <App />,
        children: [
            {
                path: "/",
                element: <PokemonDisplay />
            },
            {
                path: "/pokemon",
                element: <PokemonDisplay />
            },
            {
                path: "/pokemon/:pokedex_id",
                element: <PokemonDetails />
            },
        ]
    }
])

export default router