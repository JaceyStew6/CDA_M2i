let person = {
  firstname: "John",
  lastname: "DUPONT",
  birthdate: "11/12/2023",
};

let myPeople = [];
let id = 2;

function newRow () {
  let firstName = document.getElementById("input-prenom").value;
  let lastName = document.getElementById("input-nom").value;
  let birthDate = document.getElementById("input-birthdate").value;

  let newPerson = person = { firstname: firstName, lastname: lastName, birthdate: birthDate}
  console.log(newPerson);

  myPeople.push(newPerson);

  let table = document.getElementById("my-table");
  let row = table.insertRow(-1);
  let cell1 = row.insertCell(0);
  let cell2 = row.insertCell(1);
  let cell3 = row.insertCell(2);
  let cell4 = row.insertCell(3);

  cell1.innerHTML = id;
  cell2.innerHTML = firstName;
  cell3.innerHTML = lastName;
  cell4.innerHTML = birthDate;

  id++;

}