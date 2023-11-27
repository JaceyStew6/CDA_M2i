document.addEventListener("DOMContentLoaded", () => {
  // Cette fonction sera exécutée en cas de clic sur le bouton
  document.querySelector("button#add-btn").addEventListener("click", () => {
    // On sélectionne l'input de notre page
    const inputElement = document.getElementById("mon-input");

    // On en extrait le texte et on en retire les espaces au début et / ou à la fin de la chaine de caractère
    const text = inputElement.value.trim();

    if (text) {
      // On créé une balise <li> vierge
      const newLIElement = document.createElement("li");

      // On fixe le contenu textuel de notre <li>
      newLIElement.textContent = text;

      // On ajoute la balise <li> remplie du texte à la fin de la balise <ul> (.appendChild() place l'élément avant la balise fermante)
      document.getElementById("result").appendChild(newLIElement);
    }
  });
});
