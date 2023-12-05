const fs = require('fs');
const path = require('path');

let directory = process.argv[2];
let extension = "."+ process.argv[3];

fs.readdir(directory, (err, files) => {
    if(err)  {
        console.log(err.message)
    }
    else { 
        // console.log("\Filenames with the .txt extension:"); 
        files.forEach(file => { 
          if (path.extname(file) === extension) 
            console.log(file);
          }) 
        }
})