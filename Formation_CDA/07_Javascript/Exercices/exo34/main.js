const BASE_URL_API = "https://pokeapi.co/api/v2/";

let name = document.getElementById("input-name").value;
let id = document.getElementById("input-id").value;

function mapPokemon(data){
    return{
        name: data.name,
        weight: data.weight,
        height: data.height,
        types: data.types,
        abilities: data.abilities,
        id: data.id,
    }
}

async function getPokemon(value){
    const response = await fetch(BASE_URL_API + "pokemon/" + value);
    const data = await response.json();
    return data;
}

// async function getPokemonByName(name){
//     const response = await fetch(BASE_URL_API + "pokemon/" + name);
//     const data = await response.json();
//     return data;
// }

///!\ Condenser la recherche avec une seule fonction, permettant de récupérer soit par le nom, soit par l'ID
// async function getPokemonById(id){
//     const response = await fetch(BASE_URL_API + "pokemon/" + id);
//     const data = await response.json();
//     return data;
// }

// async function createNewPokemon(post){
//     const response = await fetch("https://jsonplaceholder.typicode.com/posts", {
//         headers: {
//             "Content-Type": "application/json",

//         method: "POST",

//         body: JSON.stringify(post),
//         }
//     });
//     const data = await response.json();
//     return data;
// }

document.addEventListener("DOMContentLoaded", async () => {
    
    document.querySelector("#pokemon-form").addEventListener("submit", (event) => {
        event.preventDefault();
    })
    
    const ditto = await getPokemon("ditto");
    const datas = [ditto].map(mapPokemon);
    console.log(datas);




    // document.getElementById("submit-btn").addEventListener("click", mapPokemon)
})