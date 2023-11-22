//Un commentaire sur une ligne

/*Un commentaire
sur plusieurs lignes*/


//Interaction

// alert("Hello")

console.log("Coucou!!");
console.error("Une erreur!!");
console.warn("Attention!!");
console.info("Une info!!");

console.log("%cUn joli message!!", "font-size:32px; background-color:blue");  //inclure du CSS directement

//Variables

//var (ES5)

var maVariable = "Salut à tous";
maVariable = 42;
console.log(maVariable)

// const (ES6)

const PI = 3.14;

// PI = 3.141 //error
console.log(PI)

// let (ES6)

let maVariableLet; //Ceci est la déclaration

console.log(maVariableLet) //résultat: Undefined

console.log("type de ma variable maVariableLet : " + typeof maVariableLet + ".");

maVariableLet = "salut" //Assignation

console.log(maVariableLet) //résultat: salut

console.log("type de ma variable maVariableLet : " + typeof maVariableLet + ".");

maVariableLet = 33;

console.log("type de ma variable maVariableLet : " + typeof maVariableLet + ".");

let str = "Ma chaine de caractères"; //string

console.log("type de ma variable str : " + typeof str + ".");

let nbr = 15; //number

console.log("type de ma variable nbr : " + typeof nbr + ".");

let boolean = true; //boolean
boolean = false; //boolean
console.log("type de ma variable boolean : " + typeof boolean + ".");

let maVariableNull = null; //object

console.log("type de ma variable maVariableNull : " + typeof maVariableNull + ".");


// Interaction
// prompt


let maValeur;

maValeur = prompt("Taper une valeur"); 

console.clear(); //Nettoyage de ma console
console.log(maValeur);

console.log("type de ma variable maValeur : " + typeof maValeur + "."); //La valeur renseignée dans un prompt renverra toujours une chaîne de caractères 

//

console.log(`type de ma variable maValeur : ${typeof maValeur}.`);