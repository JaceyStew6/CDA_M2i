// Les Opérateurs Arithmétiques

// Déclaration variables à la volée

let nb1 = 10, nb2 = 65, resultat;

// L'addition

resultat = nb1 + nb2;
console.log(nb1 + " + " + nb2 + " = " + resultat);
console.log(`${nb1} + ${nb2} = ${resultat}`);

// Soustraction

resultat = nb1 - nb2;
console.log(nb1 + " - " + nb2 + " = " + resultat);
console.log(`${nb1} - ${nb2} = ${resultat}`);

// Multiplication

resultat = nb1 * nb2;
console.log(nb1 + " * " + nb2 + " = " + resultat);
console.log(`${nb1} * ${nb2} = ${resultat}`);

// Division

resultat = nb1 / nb2;
console.log(nb1 + " / " + nb2 + " = " + resultat);
console.log(`${nb1} / ${nb2} = ${resultat}`);

// Modulo (reste de la division)

resultat = nb1 % nb2;
console.log(nb1 + " % " + nb2 + " = " + resultat);
console.log(`${nb1} % ${nb2} = ${resultat}`);

// Puissance

resultat = nb1 ** nb2;
console.log(nb1 + " puissance " + nb2 + " = " + resultat);
console.log(`${nb1} puissance ${nb2} = ${resultat}`);


//Les opérateurs d'incrémentation et combinés

console.log("Les opérateurs d'incrémentation et combinés")

// Incrémentation

nb1 = nb1 + 1; //Incrémentation classique
console.log("nb1 vaut : " + nb1) //11

//Opérateur combiné +=
nb1 += 1;
console.log("nb1 vaut : " + nb1) //12

//Opérateur d'incrémentation
nb1++;
console.log("nb1 vaut : " + nb1) //13


// Decrémentation

nb1 = nb1 - 1; //Incrémentation classique
console.log("nb1 vaut : " + nb1) //12

//Opérateur combiné -=
nb1 -= 1;
console.log("nb1 vaut : " + nb1) //11

//Opérateur d'incrémentation
console.log(nb1--); //11
console.log("nb1 vaut : " + nb1) //10


// Précision pour  les  Opérateurs ++ et --

console.log("Détail opérateurs -- et ++")

console.log(nb1); //10

// Incrémentation puis lecture de la valeur (pré-incrémentation)
console.log(++nb1); //11

// Decrémentation puis lecture de la valeur (pré-decrémentation)
console.log(--nb1); //10

// Lecture de la valeur puis incrémentation (post-incrémentation)
console.log(nb1++); //10
console.log(nb1); //11

// Lecture de la valeur puis decrémentation (post-decrémentation)
console.log(nb1--); //11
console.log(nb1); //10