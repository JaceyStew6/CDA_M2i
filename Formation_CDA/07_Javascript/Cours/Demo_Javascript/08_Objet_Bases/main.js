/*
  Pour récupérer des éléments dans la page HTML, on peut utiliser plusieurs méthodes disponibles dans l'objet 'document':
  * getElementById()
  * getElementsByClassName()
  * getElementsByName()
  * 
  * querySelector()
  * querySelectorAll()
*/

document.addEventListener("DOMContentLoaded", () => {
  console.log("Une fois le DOM chargé");

  // On récupère l'élément qui nous intéresse...
  const monElement = document.getElementById("blabla");

  // On peut modifier le texte d'un élément HTML (ce qui se trouve entre les balises ouvrantes et fermantes)
  // monElement.textContent = "Nouveau <b>contenu</b>"

  // Si l'on voulait ajouter de l'HTML, il faut demander l'évaluation de ces balises au navigateur...
  monElement.innerHTML = "Nouveau <b>contenu</b>";

  const logSmth = () => {
    console.log("Something...");
  };

  monElement.addEventListener("click", () => {
    console.log("Click sur paragraphe");
  });

  const monButton = document.querySelector("button#btn-log");

  monButton.addEventListener("click", () => {
    // Autre code...
  });
});

console.log("Dés le début");
