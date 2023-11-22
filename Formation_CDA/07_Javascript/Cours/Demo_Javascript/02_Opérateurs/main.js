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



// OPERATEURS BOOLÉENS

// Opérateurs de comparaison

// Égalité 
console.log("Egalité 3 == 3 ", 3 == 3);  //true
console.log("Egalité \"3\" == 3 ", "3" == 3);  //true
console.log("Egalité 3 == 4 ", 3 == 4); //false

// Inégalité 
console.log("Inégalité 3 != 3 ", 3 != 3); //false
console.log("Inégalité 3 != 4 ", 3 != 4); //true

// Égalité stricte (vérifie le type)
console.log("Egalité stricte 3 == 3 ", 3 === 3);  //true
console.log("Egalité stricte \"3\" == 3 ", "3" === 3);  //false

// Inégalité stricte 
console.log("Inégalité stricte 3 == 3 ", 3 !== 4);  //true
console.log("Inégalité stricte \"3\" == 3 ", "3" !== 3);  //false

// Supériorité stricte 
console.log("Supériorité stricte 3 > 3 ", 3 > 3);  //false
console.log("Supériorité stricte 3 > 4 ", 3 > 4);  //false

// Supériorité 
console.log("Supériorité 3 >= 3 ", 3 >= 3);  //true
console.log("Supériorité 3 >= 4 ", 3 >= 4);  //false

// Infériorité stricte 
console.log("Infériorité stricte 3 < 3 ", 3 < 3);  //false
console.log("Infériorité stricte 3 < 4 ", 3 < 4);  //true

// Infériorité 
console.log("Infériorité 3 <= 3 ", 3 <= 3);  //true
console.log("Infériorité 3 <= 4 ", 3 <= 4);  //true


// Opérateurs logiques

// ET
console.log("Vrai ET Vrai", true && true); //true
console.log("Vrai ET Faux", true && false); //false
console.log("Faux ET Faux", false && false); //false

// OU
console.log("Vrai OU Vrai", true || true); //true
console.log("Vrai OU Faux", true || false); //true
console.log("Faux OU Faux", false || false); //false

// NON
console.log("NON Vrai", !true); //false
console.log("NON Faux", !false); //true


console.log(true && (false || (5 === "5")) || (6 < 7));
console.log(true && (false ||    false   ) ||   true );
console.log(true && (       false        ) ||   true );
console.log((true &&       false         ) ||   true );
console.log(              true             ||   true );
console.log(              true             );
