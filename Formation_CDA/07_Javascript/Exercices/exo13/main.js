// Inachevé

/*let nbUser = Number(prompt("Saisissez un nombre :"));

let sum = 0;
let nb = 1;
let message = "";


for (let i = 1; i < (nbUser / 2 + 1); i++) {

    nb = i;

    while (sum <= nbUser) {
        let add = "+ " + nb;

        if (sum < nbUser) {
            sum = sum + nb;
            message = (`${sum} = ${nb} + ${add}`);
            nb++;
        }

        if (sum === nbUser) {
            console.log(message);
            break;
        }

        if (sum > nbUser) {
            console.log("pas valable");
            break;
        }
    }
}*/


// Solution

let nombre = parseInt(prompt("Veuillez saisir un entier supérieur à 0 :"));

while (isNaN(nombre) && nombre > 0) {
    nombre = parseInt(prompt("Erreur!! Veuillez saisir un entier supérieur à 0 :"));
}

for (let entier = 1; entier < nombre / 2 + 1; entier++) {
    let somme = entier; //premier entier
    let chaine = `${nombre} = ${entier}`
    for (let j = entier + 1; j < nombre / 2 + 1; j++){
        somme += j;
        chaine += `+ ${j}`;
        if (somme > nombre){
            break;
        } else if (somme === nombre){
            console.log(chaine);
            break;
        }
    }
}


// bonus nombres premiers

/*let inputNumber = 100, divider = 2;
let primeNumbers = ""

function isPrime(number){
    //Les nombres paires ne sont pas premiers sauf 2
    if (number % 2 === 0 && number !== 2){
        return false;
    }
    
  //Si on trouve un diviseur le nombre n'est pas premier
    for (let i = 3; i < number / 2; i+= 2){
        if (number % i === 0){
            return false;
        }
    }

    return true;
}

while (divider <= inputNumber){
    if (isPrime(divider)){
        primeNumbers += `${divider}-`
    }

    //On ne check que les nombres impairs
    divider += divider % 2 === 0 ? 1 : 2;
}

console.log(primeNumbers)*/