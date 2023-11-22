function title(text) {
    return `${text.substring(0, 1).toUpperCase()}${text.substring(1).toLowerCase()}`
}

function fullName(firstName, lastName) {
    return `${title(firstName)} ${title(lastName)}`
}

console.log(fullName("jOhn", "dOE"));


// Version fonctionnelle mais moins optimisée car répétition de code

/*function fullName (firstName, lastName){
    return `${firstName.substring(0, 1).toUpperCase()}${firstName.substring(1).toLowerCase()} ${lastName.substring(0, 1).toUpperCase()}${lastName.substring(1).toLowerCase()}`;
}

console.log(fullName("jOhn", "dOE"));*/



// Correction simple

/*function nomPrenom (nom, prenom) {
    return nom + " " + prenom;
}

let resultat = nomPrenom("Pouchain", "Roxane");
console.log(resultat)*/

// console.log(nomPrenom("Pouchain", "Roxane")) // Alternative condensée pour les deux lignes du dessus




// Correction plus complexe mais pas optimisée

function nomPrenom (nom, prenom) {
    nom = nom.charAt(0).toUpperCase() + nom.substring(1).toLowerCase();
    prenom = prenom.charAt(0).toUpperCase() + prenom.substring(1).toLowerCase();
    return nom + " " + prenom;
}

console.log(nomPrenom("jOhn", "dOE"));



// Correction plus complexe optimisée

function toTitle(text){
    return text.charAt(0).toUpperCase() + text.substring(1).toLowerCase();
}

function nomPrenom (nom, prenom) {
    return toTitle(nom) + " " + toTitle(prenom);
}


// Alternative sans le charAt()

function toTitle(text){
    return text[0].toUpperCase() + text.substring(1).toLowerCase();
}

function nomPrenom (nom, prenom) {
    return toTitle(nom) + " " + toTitle(prenom);
}