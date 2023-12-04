import Personnage from './Personnage.js';

export default class Guerrier extends Personnage {
    #armure;

    constructor(nom, vie, force, armure) {
        super(nom, vie, force);
        this.#armure = armure;
    }

    attaquer(cible) {
        // On utilise le comportement de la classe parent
        // puis on l'étend
        super.attaquer(cible);
        cible.vie -= this.armure;
        console.log(`Le guerrier ${this.nom} a infligé ${this.force + this.#armure} à ${cible.nom}`);
    }


    get armure() {
        return this.#armure;
    }

    getFullLife() {
        return super.vie + this.#armure;
    }
}