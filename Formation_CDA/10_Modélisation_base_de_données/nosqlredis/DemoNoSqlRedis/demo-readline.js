const readline = require("readline");
const { stdin: input, stdout: output } = require("process");

const rl = readline.createInterface({ input, output });

menu();

async function menu() {
  let choix = "";
  do {
    choix = await customQuestion("test", rl);
  } while (choix != "0");
}

function customQuestion(question, rl) {
  return new Promise((resolve, reject) => {
    rl.question(question, (response) => {
      resolve(response);
    });
  });
}
