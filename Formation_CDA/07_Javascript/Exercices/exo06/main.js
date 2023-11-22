let minAge, maxWage, minXp;

minAge = Number(prompt("Renseignez votre age "));
maxWage = Number(prompt("Renseignez votre rémunération "));
minXp = Number(prompt("Renseignez vos années d'expérience "));



if (minAge < 30) {
    console.log("L'âge minimum pour le poste est de 30 ans");
} else if (maxWage > 40000) {
    console.log("Nous pouvons offrir un salaire maximum de 40 000 euros");
} else if (minXp < 5) {
    console.log("Nous recherchons une personne ayant minimum 5 ans d'expérience");
} else {
    console.log("Votre profil correspond à nos attentes");
}


// Solution à plusieurs messages
console.log("Autre solution 1");

let ageMin, wageMax, xpMin;

ageMin = Number(prompt("Renseignez votre age "));
wageMax = Number(prompt("Renseignez votre rémunération "));
xpMin = Number(prompt("Renseignez vos années d'expérience "));
let isAccepted = true;

if (ageMin < 30) {
    console.log("Vous n'avez pas l'âge requis");
    isAccepted = false; // Cette variable sert de "flag", elle contient un état que l'on souhaite garder pour la suite
}
if (wageMax > 40000) {
    console.log("Le salaire demandé est trop élevé");
    isAccepted = false;
}
if (xpMin < 5) {
    console.log("Vous n'avez pas l'expérience requise");
    isAccepted = false;
} 
if (isAccepted === true) {
    console.log("Vous êtes accepté");
}


//OU
console.log("Autre solution 2");

let age, wage, exp;

age = Number(prompt("Renseignez votre age "));
wage = Number(prompt("Renseignez votre rémunération "));
exp = Number(prompt("Renseignez vos années d'expérience "));
let message = "";

if (age < 30) {
    message += "Vous n'avez pas l'âge requis. \n";
    //ici += permet de faire une concaténation au niveau du message
}
if (wage > 40000) {
    message += "Le salaire demandé est trop élevé. \n";
}
if (exp < 5) {
    message += "Vous n'avez pas l'expérience requise";
} 

alert(message === "" ? "Félicitations, vous êtes engagé" : message);