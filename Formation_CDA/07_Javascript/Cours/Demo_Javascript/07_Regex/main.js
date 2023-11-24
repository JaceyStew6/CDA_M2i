// Documentation sur les Regex https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_expressions
// Des méthodes vont être appliquées aux chaînes de caractères
// Le but du Regex c'est de matcher au maximum de ce qu'il peut
// Utiliser l'outil https://regex101.com 

const re = /ab+c/ //vérifier la validité des chaines "abc" ou "abbc" ou "abbbbbbbbbc"
const re1 = new RegExp("ab+c");


const reg = /ab+c/ig;
const reg1 = new RegExp("ab+c", "ig");

