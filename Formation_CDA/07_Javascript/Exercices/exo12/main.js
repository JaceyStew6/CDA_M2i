let initPop = Number(prompt("Population initiale :"));
let increaseRate = Number(prompt("Taux d'accroissement visé en % :"));
let targetPop = Number(prompt("Population visée :"));
let targetYear = 0;

while (initPop <= targetPop) {
    initPop = initPop * (1+(increaseRate/100));
        targetYear++;
}

console.log(targetYear);
console.log(initPop);



//OU
/*let targetYear = 1;

while (initPop <= targetPop) {
    initPop = initPop * (1+(increaseRate/100));
    if (initPop <= targetPop) {
        targetYear++;
    }
}

console.log(targetYear);
console.log(initPop);*/


// Autre solution

/*let populationInitiale, tauxAccroissement, populationVisee;

// contrôles de saisie => on force l'utilisateur à ressaisir jusqu'à avoir une valeur correcte
do {
    populationInitiale = parseFloat(prompt("Entrez la population initiale (>0): "));
} while (isNaN(populationInitiale) && populationInitiale > 0);

do {
    tauxAccroissement = parseFloat(prompt("Entrez le taux d'accroissement en pourcentage (>0): "));
    
} while (isNaN(tauxAccroissement) && tauxAccroissement > 0);
tauxAccroissement = tauxAccroissement / 100;

do {
    populationVisee = parseFloat(prompt("Entrez la population visée (>0): "));
} while (isNaN(populationVisee) && populationInitiale > 0);

let annee = 0;
let populationActuelle = populationInitiale;

while (populationActuelle < populationVisee) {
    populationActuelle *= 1 + tauxAccroissement;
    annee++;
}

console.log("La population dépasse la population visée à l'année " + annee + " (" + Math.round(populationActuelle) + " habitants)");*/