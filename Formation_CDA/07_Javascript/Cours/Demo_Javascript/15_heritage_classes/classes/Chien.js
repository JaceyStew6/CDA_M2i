import Animal from './Animal.js';

export default class Chien extends Animal {
    //Redéfinition de la méthode crier() dans l'enfant
    crier(){
        // Réutilisation du comportement de la méthide 
        super.crier();
        console.log(`Je suis un chien qui s'appelle ${this.nom}`);
    }
}