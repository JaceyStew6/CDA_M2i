function sayHello() { // Définition de la fonction
    alert("Hello everyone!");  // Cette fonction affiche quelque chose, elle ne retourne pas quelque chose.
}

sayHello();  // Appel de la fonction


// console.log(sayHello); // Affichage du contenu de SayHello => la fonction: f sayHello(){.....}
// console.log(sayHello()); // Appel de la fonction puis affichage de son retour => ici undefined


// -------------------------------------------------------------------------------

// Paramètres et arguments
function sayHelloToSomeone(name) {  // name est un paramètre => comme une variable
    alert(`Hello ${name}!`);
}

sayHelloToSomeone("Guillaume"); // La valeur "Guillaume" est passée en argument lors de l'appel
let rox = "Roxane";
sayHelloToSomeone(rox);  // La valeur "Roxane" est passée en argument lors de l'appel


//--------------------------------------------------------------------------------


// Paramètre "par défaut" (ou "avec valeur par défaut")

function showMessage(from, message = "Aucun texte") { // message devient facultatif et prend une valeur par défaut. Les paramètres par défaut se placent à la fin
    alert(`${from}: ${message}`);
}

showMessage("Guillaume", "hey!"); // Prend 2 arguments
showMessage("Guillaume"); // Prend 1 argument et affichera la valeur par défaut pour message.



//--------------------------------------------------------------------------------


// Retourner un résultat

function premiereLettre(word) {
    return word.charAt(0); //charAt est une méthode qui permet de récupérer le caractère à l'endroit 0 du mot word
}

console.log(premiereLettre("Bonjour"));



//--------------------------------------------------------------------------------



// /!\ Attention, Javascript étant faiblement typé, on peut avoir ce genre de choses

function addition(a, b) {
    return a + b;
}

console.log(addition(1, 2)); // Va faire une addition

console.log(addition("un", "plus deux")); // Va faire une concaténation




//----------------------------------------------------------------------

// Fonctions anonymes ou fléchées (autres dénominations: lambda, delegates)

// Ces deux syntaxes reviennent exactement au même. On a définit une même fonction de deux manières différentes.
// Une fonction anonyme peut également prendre des paramètres.

//avec la syntaxe function
let sayHi = function () {
    alert("Hello");
}

//fonction "classique"
function sayHi2() {
    alert("Hello");
}

//fonction "flechée"
let sayHi3 = () => alert("Hello"); //return alert("Hello"), car on a qu'une seule instruction, donc il considère qu'on va systèmatiquement faire un return (ici équivaut à return alert "Hello"))
let sayHi4 = () => {
    alert("Hello"); // ici le return est obligatoire car on se trouve dans un bloc. Il est implicite ici est renvoie undefined
};


//----------------------------------------------------------------------------


// Callback

function salutations(name) {
    alert("bonjour" + name);
}

function processUserInput(callback) {
    var name = prompt("Entrez votre nom");
    callback(name);
}

processUserInput(salutations);
processUserInput(alert);
processUserInput(console.log);



//--------------------------------------------------------------------------------


// Callback: deuxième demo

function addition(x, y) {
    return x + y;
}

let soustraction = function (x, y) {
    return x - y;
}

let multiplication = (x, y) => x * y;

function calculateur(a, b, operation) {
    return operation(a, b);
}

console.log(calculateur(2, 3, addition));
console.log(calculateur(2, 3, soustraction));
console.log(calculateur(2, 3, multiplication));
console.log(calculateur(2, 3, (a, b) => a / b)); //fonction dont on ne va se servir qu'une fois ici (appelé "fonction throw away")
console.log(calculateur(2, 3, (a, b) => {
    return a % b;
}
));


console.log(addition);
console.log(soustraction);
console.log(multiplication);
console.log(2, 3, (a, b) => a / b);
console.log(2, 3, (a, b) => {
    return a % b;
}
);
console.log(function (a, b) { return a % b; });




//--------------------------------------------------------------------------------


// récursivité : une fonction peut s'appeller elle-même, mais va créer une boucle infinie. Peut être utile dans certains cas de figure très spécifiques

function fonc(){
    console.log("test");
    fonc(); 
}

fonc(); 