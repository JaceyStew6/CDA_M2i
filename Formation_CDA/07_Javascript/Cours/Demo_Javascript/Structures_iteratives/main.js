let nombre = 0;

while (nombre < 3) {
    console.log(nombre);
    nombre++;
}

nombre = 0;

do {
    console.log(nombre);
    nombre++;
} while (nombre < 3);



for (let cpt = 0; cpt < 3; cpt++) {
    console.log(cpt);
}


// Générer un jeu du juste prix

let random = Math.floor(Math.random() * 10); //Math.random permet de générer un nombre aléatoire compris entre 1 et 10 | Math.floor permet d'arrondir

console.log(random)

let response;

do {
    response = Number(prompt("Saisir un nombre entre 1 et 10:"))
} while (response !== random);



// Exemples avec continue et break

let nbr = 0;

while (nbr < 10) {
    nbr++;

    if(nbr === 4){
        console.log("QUATRE => boucle suivante")
        continue; // Passe à la boucle suivante sans prendre en considération les instructions en dessous
    }

    if(nbr === 7){
        console.log("Sept => je 'casse' la boucle" );
        break; //On casse la boucle et on en sort
    }

    console.log(nbr);
}