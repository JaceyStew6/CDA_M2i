import Character from "./Personnage.js";

export default class Magician extends Character {
    constructor(name, life, strength, mana){
        super(name, life, strength);
        this.mana = mana;
    }
    attack(target){
        // super.attack(target);
        console.log(`Personnage: ${this.name}, Cible: ${target.name}, Force: ${this.strength}, Dégats infligés: ${this.strength + this.mana}`);
    }
    soigner(character){
        super.charactersLife();
        console.log(`Mana: ${this.mana}`);
        console.log(`Restaure ${this.mana + this.life} points de vie`);
        console.log(`${character.name} a maintenant ${character.life + this.mana + this.life} points de vie`)
    }
}