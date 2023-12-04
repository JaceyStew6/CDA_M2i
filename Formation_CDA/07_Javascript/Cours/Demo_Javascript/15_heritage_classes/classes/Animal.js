export default class Animal { //Classe
    constructor(nom, age) {
        this.nom = nom;
        this.age = age;
    }

    crier(){ //Méthode
        console.log("Je suis un animal et je crie");
    }
}