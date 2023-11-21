// Table de multiplication avec affichage simple

/*let table, multiple;
let n = Number(prompt("Veuillez saisir une table de multiplication entre 1 et 10"));

for (table = 1; table < n+1; table++) {
    console.log("\nTable des " + table + " :");

    for (multiple = 1; multiple < 11; multiple++) {
        console.log(table + " x " + multiple + " = " + (table*multiple));
    }
}*/  



// let table, multiple, result;
// let nbr = Number(prompt("Veuillez saisir une table de multiplication entre 1 et 10"));
//     let line1 = "";
//     let line2 = "";

// for (table = 1; table < nbr+1; table++) {


//     line1 += "|" + table.toString().padStart(3);

//     for (multiple = 1; multiple < 11; multiple++) {
//         result = table*multiple;
//         line2 += "|" + result.toString().padStart(3);
//     }
    
//     line2 += "\n" + "+---+---+---+---+---+---+---+---+---+---+\n"
// }   
// console.log("=========================================\n")
// console.log(line1); 
// console.log("=========================================\n")
// console.log(line2)


// Correction

let affichageTotalTables = "";

let entete = ""
for(let chiffre = 1; chiffre <= 10; chiffre++){
    entete += `\t${chiffre}`;
}
affichageTotalTables += entete + "\n";

affichageTotalTables += "----".repeat(10) + "---" + "\n";

for(let table = 1; table <= n; table++){
    let ligneAAfficher = ""
    for(let mul = 1; mul <= 10; mul++){
        ligneAAfficher += `\t${table*mul}`;
    }
    affichageTotalTables += ligneAAfficher + "\n";
}

console.log(affichageTotalTables);



// version Difficile (avec le code de Cécile)

let number = parseInt(prompt("Entrez le nombre maximal pour la table de multiplication :"), 10);
let cellWidth = parseInt(prompt("Entrez la largeur de la cellule (nombre d'espaces) :"), 10);

// le séparateur et l'en-tête
let separator = '+' + ('-'.repeat(cellWidth + 2)+ '+').repeat(10); 
let header = '|';
for (let i = 1; i <= 10; i++) { 
        header += ` ${i.toString().padEnd(cellWidth, ' ')} |`;
}

// Affichage de l'en-tête de la table
console.log(separator);
console.log(header);
console.log(separator);

// Construire et afficher chaque ligne de la table
for (let i = 1; i <= number; i++) {
    let row = '|';
    for (let j = 1; j <= 10; j++) {
        let product = (i * j).toString().padEnd(cellWidth, ' ');
        row += ` ${product} |`;
    }
    console.log(row);
    console.log(separator);
}