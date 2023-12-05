const fs = require('fs');
const path = require('path');

module.exports = function filteredFiles (directory, extension, callback){
    fs.readdir(directory, (err, files) => {
        if(err)  {
            console.log(err.message)
        }
        files.forEach(file => { 
            if (path.extname(file) === extension) 
                console.log(file);
              });
    });
}