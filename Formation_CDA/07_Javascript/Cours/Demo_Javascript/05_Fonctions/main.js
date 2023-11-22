function sayHello(){ // Définition de la fonction
    alert("Hello everyone!");  // Cette fonction affiche quelque chose, elle ne retourne pas quelque chose.
}

sayHello();  // Appel de la fonction


// console.log(sayHello); // Affichage du contenu de SayHello => la fonction: f sayHello(){.....}
// console.log(sayHello()); // Appel de la fonction puis affichage de son retour => ici undefined



// Paramètres et arguments
function sayHelloToSomeone(name) {  // name est un paramètre => comme une variable
    alert(`Hello ${name}!`);
}

sayHelloToSomeone("Guillaume"); // La valeur "Guillaume" est passée en argument lors de l'appel
let rox = "Roxane";
sayHelloToSomeone(rox);  // La valeur "Roxane" est passée en argument lors de l'appel


// Paramètre "par défaut" (ou "avec valeur par défaut")

function showMessage(from, message = "Aucun texte") { // message devient facultatif et prend une valeur par défaut. Les paramètres par défaut se placent à la fin
    alert(`${from}: ${message}`);
}

showMessage("Guillaume", "hey!"); // Prend 2 arguments
showMessage("Guillaume"); // Prend 1 argument et affichera la valeur par défaut pour message.


// Retourner un résultat

function premiereLettre(word){
    return word.charAt(0); //charAt est une méthode qui permet de récupérer le caractère à l'endroit 0 du mot word
}

console.log(premiereLettre("Bonjour"));


// /!\ Attention, Javascript étant faiblement typé, on peut avoir ce genre de choses

function addition(a, b){
    return a+b;
}

console.log(addition(1,2)); // Va faire une addition

console.log(addition("un", "plus deux")); // Va faire une concaténation