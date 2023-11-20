let rayon, hauteur, result;

rayon = Number(prompt("Veuillez saisir un rayon"));
hauteur = Number(prompt("Veuillez saisir une hauteur"));

result =  (Math.PI * rayon**2 * hauteur) / 3;

console.log("Le volume du cône droit est de " + result.toFixed(2) + " m³"); //toFixed: méthode qui permet d'arrondir le résultat, ici à 2 décimales

// Autre méthode pour afficher le résultat
/*let message = `Le volume du cône droit est de ${result} m³`;
console.log(message);*/


// Code condensé (pas une bonne pratique) Bien retenir qu'il y a un ordre d'exécution: tout ce qui se trouve le plus entre parenthèses est lu en premier et ainsi de suite de manière décroissante
// console.log("Le volume du cône droit est de " + (Math.PI * Number(prompt("Veuillez saisir un rayon"))**2 * Number(prompt("Veuillez saisir une hauteur"))) / 3);
