// let tab = [];
// let tab = Array();

let tab = ["Pomme", "Orange", true, 0.5, 6];

console.table(tab);

tab.push("Ananas"); // Ajout à la fin
tab.unshift("Ananas"); // Ajout au début

console.table(tab);

let ananas1 = tab.pop(); // Retirer à la fin
let ananas2 = tab.shift(); // Retirer au début

console.table(tab);

tab[1] = "ORANGE"; // Remplace l'élément à l'indice 1 par ORANGE. On réécrit par dessus l'ancien élément.
console.table(tab);

tab[100] = "ORANGE SANGUINE"; //Ajoute un élément à un indice non existant
console.table(tab);

console.log("tab[10] : " + tab[10]);
console.log("tab[10] : " + tab[10]);
console.log("tab[100] : " + tab[100]);



console.log(tab.indexOf("ORANGE")); // Retourne l'indice lié à l'élément dans le tableau. Si on a plusieurs éléments du même nom, il s'arrêtera au premier => retourne le premier trouvé qui correcpond (===)
console.log(tab.lastIndexOf("ORANGE")); // dernier trouvé qui correspond (===)


// Découper un tableau
console.table(tab.splice(2, 5)); // Nouveau tableau. On retire 5 éléments consécutifs à partir de l'index 2.
console.table(tab); // l'ancien tableau n'a plus les valeurs de départ


// Supprimer une valeur directement

delete tab[1] // Le delete permet d'intéragir avec la donnée stockée dans la mémoire. Grâce au delete on peut supprimer cette donnée. Cependant, l'index ne bouge pas. Dans les faits, on ne l'utilise quasiment jamais.
console.table(tab);


//ré-indexer le tableau

console.log(tab.filter(val => val));

// copier un tableau
let tab1 = ["Pomme", "orange", true, 0.5, 6];

let tab2 = [...tab1]; // On aura 2 tableaux différents
let tab3 = tab1; ///!\ ici nous avons le MEME tableau dans les 2 variables (le même dans la mémoire)

tab.push("test")

console.table(tab1);
console.table(tab2);
console.table(tab3);


let tab4 = ["Pomme", "Orange", "Ananas", "fleur", "pierre"];

// foreach
tab.forEach((item, index) => console.log(`tab[${index}] = ${item}`));


//map
let newTab = tab4.map(value => value.toUpperCase()); //Permet de transformer et d'avoir un nouveau tableau /!\ Ici on aura une erreur car seul les types string peuvent prendre une méthode .toUpperCase()
console.table(newTab);