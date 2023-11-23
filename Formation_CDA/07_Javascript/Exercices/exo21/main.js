let tab = [];
let space = "";

for (let i = 0; i < 10; i++) {

    tab.push(prompt("Saisissez une valeur: "));

    console.log(`${space} ${tab[i]} `);
    space += "   "
}


// console.table(tab);