// Aide pour couleur dans console: https://blog.devgenius.io/how-to-add-colors-in-javascript-console-log-output-e41efeffa8dd)

// Ma solution

/*let height = Number(prompt("Veuillez saisir une hauteur :"));

let space = " ";
let stars = "*";

for (let line = 1; line <= height; line++) {
    console.log(space.repeat(height - line) + stars);
    stars += "**";
}*/


//Solution alternative

/*let height = Number(prompt("Veuillez saisir une hauteur :"));

let space = " ";

for (let line = 1; line <= height; line++){
    console.log(space.repeat(height-line) + "*".repeat(1+(line-1)*2));
}*/


// Le sapin

let tree = Number(prompt("La taille du bô sapin (min 10 (sinon c'est moche)): "));
let foot = Number(prompt("La longueur du pied du bô sapin (min 1)"));

let msg = "", greenStar = "\x1B[32m*", strFoot = "|    |";
let temp;

const getRandomNbr = (max = 5, min = 0) => { return Math.round(Math.random() * (max - min) + min) };

if (tree < 10) tree = 10;
if (foot < 1) foot = 1;

for (let i = 1; i <= tree + 1; i++) {
    if (i === 1) {
        temp = "\x1B[33mA";
    } else {
        // il faut i*2 - 2 caractère sur une ligne (exemple pour la 3ème ligne, il me faut 3*2 - 2 = 5 caractères)
        for (let j = 0; j < (i * 2 - 2); j++) {
            // getRandomNbr() >= 4 |==> on veut que 2/5 caractères des 0 colorés
            temp += (getRandomNbr() >= 4) ? `\x1B[${getRandomNbr(96, 91)}m0` : greenStar;
        }
    }

    temp = temp.padStart((tree - i + 1) + temp.length); //adaptation du padding pour aligner l'ensemble
    msg += temp + "\n";
    temp = greenStar; // une étoile verte est affectée à temp pour la prochaine itération
}
for (let i = 0; i < foot; i++) {
    // incrémentation du message finale + adaptation du padding
    msg += "\x1B[31m" + strFoot.padStart(Math.round(tree + strFoot.length / 2)) + "\n";
}
// le bô sapin. Crucial.
msg += '\u25A0 Le bô sapin. \u25A0'.padStart(tree + 8);

console.log(msg);
