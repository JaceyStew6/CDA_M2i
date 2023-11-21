let initPop = Number(prompt("Population initiale :"));
let increaseRate = Number(prompt("Taux d'accroissement visé en % :"));
let targetPop = Number(prompt("Population visée :"));
let targetYear = 0;

while (initPop <= targetPop) {
    initPop = initPop * (1+(increaseRate/100));
        targetYear++;
}

console.log(targetYear);
console.log(initPop);



//OU
/*let targetYear = 1;

while (initPop <= targetPop) {
    initPop = initPop * (1+(increaseRate/100));
    if (initPop <= targetPop) {
        targetYear++;
    }
}

console.log(targetYear);
console.log(initPop);*/