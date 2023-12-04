import Character from './Personnage.js'
import Warrior from './Guerrier.js'
import Magician from './Magicien.js'

let ellie = new Character("Ellie", 10, 10);
let target = new Character("Abby", 5, 12);

ellie.attack(target);
ellie.charactersLife();

let kratos = new Warrior("Kratos", 15, 15, 5);
target = new Character("Thor", 10, 12);

kratos.attack(target);
kratos.charactersLife();

let hermione = new Magician("Hermione", 10, 12, 12);
target = new Character("Voldemort", 15, 5);
hermione.attack(target);
hermione.charactersLife()
