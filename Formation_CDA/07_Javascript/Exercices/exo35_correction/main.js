import Guerrier from './classes/Guerrier.js';
import Magicien from './classes/Magicien.js';

let conanLeBarbare = new Guerrier("Conan", 12, 2, 4);
let terminator = new Guerrier("Terminator", 10, 1, 3);
let gandalf = new Magicien("Gandalf", 5, 2, 8);

console.log(`vie ${terminator.nom}: ${terminator.vie}`);
conanLeBarbare.attaquer(terminator);
console.log(`vie ${terminator.nom}: ${terminator.vie}`);

gandalf.soigner(terminator)
console.log(`vie ${terminator.nom}: ${terminator.vie}`);

conanLeBarbare.attaquer(terminator);
conanLeBarbare.attaquer(terminator);

console.log(`vie ${terminator.nom}: ${terminator.vie}`);


