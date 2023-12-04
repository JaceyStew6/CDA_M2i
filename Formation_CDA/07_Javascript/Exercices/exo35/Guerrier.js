import Character from "./Personnage.js";

export default class Warrior extends Character {
    constructor(name, life, strength, armor){
        super(name, life, strength);
        this.armor = armor;
    }
    attack(target){
        // super.attack(target);
        console.log(`Personnage: ${this.name}, Cible: ${target.name}, Force: ${this.strength}, Dégats infligés: ${this.strength + this.armor}`);
    }
    charactersLife(){
        super.charactersLife();
        console.log(`Armure: ${this.armor}`);
    }
}