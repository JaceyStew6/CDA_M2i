let tab = [];
let space = "";

for (let i = 0; i < 10; i++) {

    tab.push(prompt("Saisissez une valeur: "));

    console.log(`${space} ${tab[i]} `);
    space += "   "
}


// console.table(tab);


//------------------------------
//Correction

let tableau = Array(10)   //Permet de faire un tableau vide qui prend une taille 10

for (let i = 0; i < tableau.length; i++) {
    // tableau[i] = parseInt(prompt(`Saisir la valeur n° ${i + 1}`)); //permet à l'utilisateur de saisir les valeurs
    tableau[i] = (Math.random() * 100).toFixed(0); // génère aléatoirement des valeurs
}

for (let i = 0; i < tableau.length; i++) {
    console.log("\t".repeat(i) + tableau[i])
}

console.log("-".repeat(40));

//Alternative

let tabs = ""

for (let item of tableau) {
    console.log(tabs + item);
    tabs += "\t";
}

//Alternative à for ... of
tabs = ""
tableau.forEach(console.log); //Affiche la valeur et l'index
tableau.forEach((val, index) => {
    console.log(tabs + val);
    tabs += "\t";
});


