let nbUser = Number(prompt("Saisissez un nombre :"));

let total;
let addNb = 0;
let nb = 1;


while (total < nbUser){
    
    total = nb ;

    if (total === nbUser){
        console.log();
        break;
    }
    

    if (total > nbUser) {
        break
    }

    addNb = nb++;

}