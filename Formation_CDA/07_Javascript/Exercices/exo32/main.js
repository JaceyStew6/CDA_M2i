import Videogame from "./videogame.js";

document.addEventListener("DOMContentLoaded", () => {
  const modal = document.getElementsByClassName("modal")[0];

  document.getElementById("modal-btn-close")?.addEventListener("click", () => {
    modal.style.display = "none";
  });

  modal.addEventListener("click", (event) => {
    if (event.target === event.currentTarget) modal.style.display = "none";
  });

  document.getElementById("btn-add-element-modal")?.addEventListener("click", () => {
    modal.style.display = "flex";
  });



  let gameTable = [];
  let id = 1;

  function getNewGame() {
    let gameTitle = document.getElementById("game-title").value;
    let gameType = document.getElementById("game-type").value;

    let newGame = new Videogame(gameTitle, gameType);
    gameTable.push(newGame);

    let table = document.getElementById("my-table");
    let row = table.insertRow(-1);
    let cell1 = row.insertCell(0);
    let cell2 = row.insertCell(1);
    let cell3 = row.insertCell(2);
    // let cell4 = row.insertCell(3);

    cell1.textContent = id;
    cell2.textContent = gameTitle;
    cell3.textContent = gameType;
    // cell4 = deleteBTNElement;

    id++;

  }

  document.getElementById("add-btn").addEventListener("click", getNewGame);


  gameTable.forEach((p, i) => {

    // const newLIElement = document.createElement("li");
    // newLIElement.textContent = `${gameTitle} ${gameType}`;
    // newLIElement.setAttribute("data-videogame-game-title", gameTitle);
    // newLIElement.addEventListener("click", () => {
    //   newLIElement.remove();
    // });

    // document.getElementById("mon-ul")?.appendChild(newLIElement);

    const newTRElement = document.createElement("tr");
    const idTDElement = document.createElement("td");
    idTDElement.textContent = i;
    const nameTDElement = document.createElement("td");
    nameTDElement.textContent = p;

    const actionsTDElement = document.createElement("td");
    const deleteBTNElement = document.createElement("button");
    deleteBTNElement.textContent = "Supprimer";
    deleteBTNElement.addEventListener("click", () => {
      newTRElement.remove();
    });
    actionsTDElement.appendChild(deleteBTNElement);
    newTRElement.appendChild(idTDElement);
    newTRElement.appendChild(nameTDElement);
    newTRElement.appendChild(actionsTDElement);
    document.getElementById("mon-tbody")?.appendChild(newTRElement);

  });


  /*  ["The Last of Us", "Dead Cells", "Hades"].forEach((gameTitle, i) => {
      const newLIElement = document.createElement("li");
      newLIElement.textContent = gameTitle;
      newLIElement.setAttribute("data-videogame-game-title", gameTitle);
      newLIElement.addEventListener("click", () => {
        newLIElement.remove();
      });
  
      document.getElementById("mon-ul")?.appendChild(newLIElement);
      const gameTitle = document.getElementById("game-title")?.value;
      const newTRElement = document.createElement("tr");
      const idTDElement = document.createElement("td");
      idTDElement.textContent = i;
      const nameTDElement = document.createElement("td");
      nameTDElement.textContent = gameTitle;
  
      document.getElementById("add-btn").addEventListener("click", () => {
        newTRElement.add();
      });
  
      const actionsTDElement = document.createElement("td");
      const deleteBTNElement = document.createElement("button");
      deleteBTNElement.textContent = "Supprimer";
      deleteBTNElement.addEventListener("click", () => {
        newTRElement.remove();
      });
      actionsTDElement.appendChild(deleteBTNElement);
      newTRElement.appendChild(idTDElement);
      newTRElement.appendChild(nameTDElement);
      newTRElement.appendChild(actionsTDElement);
      document.getElementById("mon-tbody")?.appendChild(newTRElement);
  
    });*/


  document.getElementById("delete-btn")?.addEventListener("click", () => {
    const value = document.getElementById("id-to-del")?.value;

    if (value) {
      console.log(value);
      const elementFound = document.querySelector(
        `[data-videogame-game-title="${value}"]`
      );
      elementFound?.remove();
    }
  });
});
