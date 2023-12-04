export default class Personnage {
    #nom;
    #vie;
    #force;

    constructor(nom, vie, force) {
        this.#nom = nom;
        this.#vie = vie;
        this.#force = force;
    }

    attaquer(cible) {
        // On vérifie que l'objet passé en paramètre est une instance de Personnage
        if(!cible instanceof Personnage) {
            throw new Error("La cible n'est pas un personnage");
        }

        cible.vie -= this.force;
    }

    get nom() {
        return this.#nom;
    }

    get vie() {
        return this.#vie;
    }

    // La vie d'un personnage ne peut pas descendre en dessous de 0
    set vie(value) {
        this.#vie = value <= 0 ? 0 : value;
    }

    get force() {
        return this.#force;
    }

    set force(value) {
        this.#force = value;
    }

}