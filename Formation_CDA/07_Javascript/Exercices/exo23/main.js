let tab = [];

function checkRatings(tab) {
    for (i = 0; i < tab.length; i++) {
        if (tab[i] > 20) {
            return false;
        }
        // else if (tab[i] < 0) {
        //     break;
        // }
    }
    return true;
}

let nbRatings = Number(prompt("Combien de notes ? "));

function enterRatings(message) {

    for (let i = 0; i < nbRatings; i++) {
        tab[i] = Number(prompt(message));
        while (!checkRatings(tab[i])) {
            tab[i] = Number(prompt("ERREUR, veuillez réessayer : "));
        }
    }
    return tab;
}


let ratings = enterRatings("Veuillez entrer une note entre 0 et 20 compris : ");

console.table(enterRatings(ratings));