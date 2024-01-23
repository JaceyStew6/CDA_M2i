import fs from 'fs';

let directory = "./documents/nouveau_repertoire";
let file = "./documents/nouveau_repertoire/nouveau_fichier.txt";

//Créer un répertoire
if (fs.existsSync(directory)) {
    console.log("Le répertoire existe déjà");
} else {
    fs.mkdirSync(directory);
    console.log("Répertoire créé avec succès!");
}

// Ecrire du texte dans un nouveau fichier
if (!fs.existsSync(file)) {
    fs.writeFileSync(file, "Le Node c'est pas ouf!", 'utf8');
    console.log("Le fichier a été enregistré");
}else {
    console.log("Un fichier du même nom existe déjà");
}

//Lire le contenu du nouveau_fichier.tx et afficher le résultat en console
const data = fs.readFileSync(file, 'utf8');
console.log("Contenu de nouveau_fichier.txt :", data);

//Lister tous les fichiers et répertoires dans le répertoire actuel et afficher le résultat
const files = fs.readdirSync(".")
console.log("Contenu du répertoire:", files)

// Supprimer le fichier nouveau_fichier.txt
fs.unlinkSync(file)
console.log("Fichier supprimé avec succès!");

// Supprimer le répertoire nouveau_repertoire
fs.rmdirSync(directory)
console.log("Répertoire supprimé avec succès!");