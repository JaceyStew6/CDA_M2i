function compterLettreA (str){
let nbA = 0;    
    for (let i = 0; i <= str.length; i++) {

        if (str.charAt(i) === "a"){
            nbA++;
        }  
    }  
    return nbA;  // /!\ Le return doit bien se faire après la boucle
}

let str = "abba";
console.log(`# résultat : ${compterLettreA(str)}`);
str = "mixer";
console.log(`# résultat : ${compterLettreA(str)}`);