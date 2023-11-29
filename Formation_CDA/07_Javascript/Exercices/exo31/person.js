export default class Person {
    #lastname;
    #firstname;
    #birthdate;

    constructor(lastname, firstname, birthdate) {
        this.#lastname = lastname;
        this.#firstname = firstname;
        this.#birthdate = birthdate;
    }

    get lastname(){
        return this.#lastname;
    }

    set lastname(value){
        if (typeof value !== 'number') {
            return this.#lastname = value;
        } else {
             return console.error("Ce n'est pas un nom valide")
        }
    }

    get firstname(){
        return this.#firstname;
    }

    set firstname(value){
        if (value === "Jane") {
            return console.error("Ce nom n'est pas valide")
        } else if (typeof value !== 'number') {
            return this.#firstname = value;
        } else {
            return console.error("Ce n'est pas un nom valide")
        }
    }

    get birthdate(){
        return this.#birthdate;
    }
}

const test = new Person('Doe', 'Jane', '12/03/1980');

console.log(test);