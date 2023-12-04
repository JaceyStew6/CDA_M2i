export default class Character{
    constructor(name, life, strength){
        this.name = name;
        this.life = life;
        this.strength = strength;
    }

    attack(target){
        console.log(`Personnage ${this.name}, Cible: ${target.name}, Dégats infligés ${this.strength}`);
    }

    charactersLife(){
        console.log(`Vie restante: ${this.life}`);
    }
}