function title(text) {
    return `${text.substring(0, 1).toUpperCase()}${text.substring(1).toLowerCase()}`
}

function fullName(firstName, lastName) {
    return `${title(firstName)} ${title(lastName)}`
}

console.log(fullName("jOhn", "dOE"));


// Version fonctionnelle mais moins optimisée car répétition de code

/*function fullName (firstName, lastName){
    return `${firstName.substring(0, 1).toUpperCase()}${firstName.substring(1).toLowerCase()} ${lastName.substring(0, 1).toUpperCase()}${lastName.substring(1).toLowerCase()}`;
}

console.log(fullName("jOhn", "dOE"));*/