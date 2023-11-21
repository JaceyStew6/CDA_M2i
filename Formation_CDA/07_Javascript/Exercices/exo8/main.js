console.log("Table des matières :");

let chapter;
let part;

for (chapter = 1; chapter < 4; chapter++) {
    console.log("\tChapitre " + chapter + " :");

    for (part = 1; part < 4; part++) {
        console.log("\t\t-partie " + chapter + "." + part);
    }
}   