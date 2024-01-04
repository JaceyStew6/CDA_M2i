//Création d'un objet pour communiquer avec Redis
const redis = require("redis");
const host = "127.0.0.1";
const port = "6379";
const client = redis.createClient(port, host);
client.on("connect", () => { }).connect();

//Création d'un objet pour intéragir avec la console
const readline = require("readline");
const { stdin: input, stdout: output } = require("process");

const rl = readline.createInterface({ input, output });

//Initialize index
initialize();

//Démarre
menu();

//Question en async
function questionAsync(question) {
    return new Promise((resolve, reject) => {
        rl.question(question, (response) => {
            resolve(response);
        });
    });
}

// Menu
async function menu() {
    console.log("Bienvenue dans le système de gestion de stocks");
    let choix = "";
    do {
        console.log(
            "1. Ajouter un produit \n2. Mettre à jour un produit \n3. Afficher les stocks \n4. Supprimer un produit \n5. Quitter"
        );
        choix = await questionAsync("Choisissez une option : ");
        switch (choix) {
            case "1":
                await addProduct();
                break;
            case "2":
                await updateProduct();
                break;
            case "3":
                await displayProducts();
                break;
            case "4":
                await deleteTask();
                break;
            // case "5":
            //     break;
        }
    } while (choix != "0");
}

//Fonction initialisation
async function initialize() {
    const indexExists = await client.get("productIndex");
    if (indexExists == null) {
        console.log("Pas d'index enregistré");
        await setProductIndex(0);
    }
}

//Récupérer index
async function getProductIndex() {
    const count = await client.get("productIndex");
    return parseInt(count);
}

//Set Index
async function setProductIndex(index) {
    await client.set("productIndex", index);
}

// Ajouter un produit
async function addProduct() {
    const name = await questionAsync("Saisissez le nom du produit : ");
    const quantity = await questionAsync("Saisissez la quantité : ");
    const price = await questionAsync("Saisissez le prix : ");
    const product = { productName: name, quantity: quantity, price: price }
    const oldIndex = await getProductIndex();
    const result = await client.hSet(`object${oldIndex + 1}`, product);
    await setProductIndex(oldIndex + 1);
    console.log(`Nom du produit : ${name} \nQuantité : ${quantity} \nPrix: ${price}`);
}