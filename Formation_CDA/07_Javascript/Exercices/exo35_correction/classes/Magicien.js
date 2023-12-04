import Personnage from "./Personnage.js";

export default class Magicien extends Personnage {
    #mana;

    constructor(nom, vie, force, mana) {
        super(nom, vie, force);
        this.#mana = mana;
    }

    attaquer(cible) {
        super.attaquer(cible);
        cible.vie -= this.mana;
        console.log(`Le magicien ${this.nom} a infligé ${this.force + this.mana} à ${cible.nom}`);
    }

    soigner(cible) {
        if(!cible instanceof Personnage) {
            throw new Error("La cible n'est pas un Personnage");
        }

        cible.vie += this.#mana;
        console.log(`Le magicien ${this.nom} a soigné ${cible.nom} de ${this.mana}pv`);
    }

    get mana() {
        return this.#mana;
    }
}