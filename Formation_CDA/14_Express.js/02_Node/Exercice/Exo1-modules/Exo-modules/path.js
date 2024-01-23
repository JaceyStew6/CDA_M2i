import path from 'path';
// const path = require('path');

//Créer un chemin complet vers le fichier rapport.txt
const cheminComplet = path.join(".", "documents", "rapport.txt");

console.log(cheminComplet);

//Obtenir un chemin absolu du fichier rapport.txt
const cheminAbsolu = path.resolve(cheminComplet);
console.log(cheminAbsolu)

//Vérifier si le fichier a une extension .txt
const extension = path.extname(cheminAbsolu);

if (extension == ".txt"){
    console.log("is .txt");
} else {
    console.log("not .txt")
}

//Obtenir le répertoire du fichier rapport.txt
const repertoire = path.dirname(cheminAbsolu);
console.log(repertoire);

// Extraire nom du fichier (sans l'extension)à partir du chemin absolu
const nomFichier = path.basename(cheminAbsolu, ".txt");
console.log(nomFichier);

//Obtenir un objet avec les détails du chemin du fichier rapport.txt
const detailsChemin = path.parse(cheminAbsolu);
console.log(detailsChemin);

//Créer un chemin normalisé à partir de segments relatifs
const cheminNormalise = path.normalize("/Users/Administrateur//Documents/CDA_M2I/CDA_M2i/Formation_CDA/14_Express.js/02_Node/Exercice/Exo1-modules/Exo-modules/documents/rapport.txt");
console.log(cheminNormalise);
