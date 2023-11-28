import Person from "./person.js";

let personTable = [];
let id = 1;


function getNewPerson() {
    let lastName = document.getElementById("input-lastname").value;
    let firstName = document.getElementById("input-firstname").value;
    let birthDate = document.getElementById("input-birthdate").value;

    let newPerson = new Person(lastName, firstName, birthDate);
    personTable.push(newPerson);

    let table = document.getElementById("my-table");
    let row = table.insertRow(-1);
    let cell1 = row.insertCell(0);
    let cell2 = row.insertCell(1);
    let cell3 = row.insertCell(2);
    let cell4 = row.insertCell(3);

  
    cell1.textContent = id;
    cell2.textContent = lastName;
    cell3.textContent = firstName;
    cell4.textContent = birthDate;
  
    id++;

}

document.getElementById("add-btn").addEventListener("click", getNewPerson());
