// Structures conditionnelles

//if ... else if ... else

/*let age = Number(prompt("Saisir age :"));

if (age < 0 || age === NaN) { //NaN : Not a Number
    console.log("Age invalide!!!");
} else if (age < 18) {
    console.log("Vous êtes mineur");
} else if (age < 255) {
    console.log("Vous êtes majeur");
} else {
    console.log("Vous êtes beaucoup trop vieux pour être encore là!!");
}*/


// switch ... case

/*let choix = Number(prompt("Choisir un chiffre entre 1 et 3:"));

switch (choix) {
    case 1:
        console.log("choix 1");
        break;
    case 2:
        console.log("choix 2");
        break;
    case 3:
        console.log("choix 3");
        break;
    default:
        console.log("choix invalide");
        break;
}*/


// Opérateur ternaire
// <conditio>n ? <valeur si vrai> : <valeur si faux>

let isPIGreaterThan4 = (Math.PI > 4) ? "Yes" : "No";
console.log(isPIGreaterThan4);



// Opérateur de coalescence nulle
// <valeur1> ?? <valeur défaut si valeur 1 == null ou undefined>

let valNull = null;
// let valNull = undefined;
// let valNull = 3;
// let valNull = "chaine";

console.log(valNull ?? "valeur par défaut");