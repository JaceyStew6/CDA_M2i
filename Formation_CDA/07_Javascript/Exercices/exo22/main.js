let rowNbr = Number(prompt("Saisissez le nombre d'éléments à générer: "));
let tab = [];
let result = 0;
let message = " "
    for (let i = 0; i < rowNbr; i++) {
        tab[i] = Math.floor(Math.random() * 50);
        result = (tab[i] % 2  == 0) ? "  pair" : "impair";
            
        message = `Le nombre ${tab[i].toString().padStart(3, " ")} est ${result}.`;
        console.log(message);
    }

console.table(tab);


//------------------------------------------------------------
//Correction


let taille = parseInt(prompt("Saisir la taille du tableau : "));

let tableau = Array(taille)

for (let i = 0; i < tableau.length; i++){
    tableau[i] = (Math.random() * 51).toFixed(0);
}

for (let item of tableau){
    console.log(`Le nombre ${item.toString().padStart(2, " ")} est ${item % 2 === 0 ? " " : "im"}pair.`); //dans le padStart(), les " " ne sont pas obligatoires car il s'agit du caractère par défaut
}

//------------------------------------------------------------
//Fonctionne mais inachevé

/*function getArray() { 
    let rowNbr = Number(prompt("Saisissez le nombre d'éléments à générer: "));
    let tab = [];
    for (let i = 0; i < rowNbr; i++) {
        tab[i] = Math.floor(Math.random() * 50);
    }
    return console.table(tab);
}

getArray()*/


//------------------------------------------------------------

// Ne fonctionne pas et inachevé
/*function userInput(){
    let rowNbr = Number(prompt("Saisissez le nombre d'éléments à générer: "));
    return rowNbr;
}


function getArray() { 
    let tab = [];
    for (let i = 0; i < rowNbr; i++) {
        tab[i] = Math.floor(Math.random() * 50);
    }
    return tab;

}

console.table(userInput(getArray));*/