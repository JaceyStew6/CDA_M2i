import Animal from './Animal.js'

export default class Chat extends Animal {
constructor(name, age, jouet){
    //La fonction super permet d'appeler le constructeur du parent.
    super(name, age) 
    // On ajoute un attribut à notre classe
    this.jouet = jouet;
}
}

// Cette fonction va permettre d'appeler le constructeur du parent et de l'utiliser comme si c'était un animal