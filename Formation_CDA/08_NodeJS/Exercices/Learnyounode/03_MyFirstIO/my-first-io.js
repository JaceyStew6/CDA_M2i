const fs = require('fs');

const file = fs.readFileSync(process.argv[2]);

const linesNb = file.toString().split("\n").length-1;

console.log(linesNb);