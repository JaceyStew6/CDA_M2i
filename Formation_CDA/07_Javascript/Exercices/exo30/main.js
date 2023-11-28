import Animal from "./animals.js";

let animalsTable = [];
let id = 2;


function getNewAnimal() {
    let name = document.getElementById("input-name").value;
    let species = document.getElementById("input-species").value;

    let newAnimal = new Animal(name, species);
    animalsTable.push(newAnimal);

    let table = document.getElementById("my-table");
    let row = table.insertRow(-1);
    let cell1 = row.insertCell(0);
    let cell2 = row.insertCell(1);
    let cell3 = row.insertCell(2);

  
    cell1.textContent = id;
    cell2.textContent = name;
    cell3.textContent = species;
  
    id++;

}

document.getElementById("add-btn").addEventListener("click", getNewAnimal);
