let tempCelcius = Number(prompt("Saisir température (°C) :"));

// if (tempCelcius < 0){
//     console.log("Etat solide");
// } else if (tempCelcius <= 100) {
//     console.log("Etat liquide");
// }else{
//     console.log("Etat gazeux");
// }



// Opérateur ternaire
let waterState = (tempCelcius < 0) ? "Etat solide" : ((tempCelcius <= 100) ? "Etat liquide" : "Etat gazeux");
console.log(waterState);