function palindrome(word) {
    let reverseWord = "";
    for (let i = word.length - 1; i >= 0; i--) {
        reverseWord += word[i];
    }

    if (word == reverseWord) {
        return console.log("Le mot " + word + " est un palindrome")
    } else {
        return console.log("Le mot " + word + " n'est pas un palindrome")
    }

}

palindrome("hello");
palindrome("kayak");

//----------------------------------------------------------------

// Correction : 1ere méthode

function isPalindrom(word) {
    word = word.trim().toLowercase()

    let reverseWord = "";
    for (let end = word.length - 1; end >= 0; end--) {
        reverseWord += word[end];
    }

    console.log(word);
    console.log(reverseWord);

    return word === reverseWord;
}

console.log(isPalindrom("hello"));
console.log(isPalindrom("kayak"));


//----------------------------------------------------------------

// Correction : 2ème méthode

function isPalindrom(word) {
    word = word.trim().toLowercase()

    for (let i = 0; i <= word.length - 1 / 2; i++) {
        if (word[i] === word[word.length - i - 1]) //Pas obligatoire de mettre les {} si on a une seule instruction à l'intérieur
            return false;
    }
    return true;
}

console.log(isPalindrom("hello"));
console.log(isPalindrom("kayak"));



//----------------------------------------------------------------

// Correction : 3ème méthode

function isPalindrom(word) {
    return word === word.split("").reverse().join("")  //Split("") permet de séparer la chaîne de caractères en plusieurs caractères individuels qu'il place dans un tableau sans en supprimer - reverse() permet d'inverser l'ordre des éléments dans le tableau - join("") permet de réunir les éléments du tableau sans rien supprimer en le passant sous une chaîne de caractère.
}


// let isPalindrom = (word) => word === word.split("").reverse().join("")  //La même fonction qu'au dessus mais en fonction fléchée.

console.log(isPalindrom("hello"));
console.log(isPalindrom("kayak"));