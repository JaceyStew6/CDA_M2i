//Version fonctionnelle mais sans formatage ni style

let timeInput = 0;
console.log(timeInput);


function getTime() {
  timeInput = document.getElementById("time-input").value;
  console.log(timeInput);
}

document.addEventListener("DOMContentLoaded", () => {

  let count;
  // let temps = 100;
  // Play

  document.querySelector("#play-count").addEventListener("click", () => {
    count = setInterval(() => {
      if (timeInput <= 0) {
        const sound = new Audio("./assets/ring.mp3");
        sound.play();
        console.log("Done");
        clearInterval(count);
        count = undefined;
      } else {

        // let hours = ;
        // let minutes = parseInt(temps / 60, 10)
        // let secondes = parseInt(temps % 60, 10)

        // timeInput.innerText = minutes + ":" + secondes
        document.querySelector("#count-value").textContent = timeInput--;
      }
    }, 1000);

  })

  //Stop

  document.querySelector("#stop-count").addEventListener("click", () => {
    clearInterval(count);
    count = undefined;
    document.querySelector("#count-value").textContent = timeInput;
  })

  document.getElementById("enter-btn").addEventListener("click", getTime);
})



// Version inachevée pour formatage de l'affichage
/*let timeInput = 0;
console.log(timeInput);

function getTime() {
  timeInput = document.getElementById("time-input").value;
  console.log(timeInput);
}
let temps = timeInput * 60

document.addEventListener("DOMContentLoaded", () => {

  const count = document.getElementById("count-value");


  document.querySelector("#play-count").addEventListener("click", () => {
    setInterval(() => {
      let minutes = parseInt(temps / 60, 10)
      let secondes = parseInt(temps % 60, 10)



      if (timeInput <= 0) {
        const sound = new Audio("./assets/ring.mp3");
        sound.play();
        console.log("Done");
        clearInterval(count);
        count = undefined;
      } else {
        minutes = minutes < 10 ? "0" + minutes : minutes
        secondes = secondes < 10 ? "0" + secondes : secondes

        count.innerText = `${minutes}:${secondes}`
        temps = temps <= 0 ? 0 : temps - 1
        // document.querySelector("#count-value").textContent = timeInput--;
      }
    }, 1000);



  })

  //Stop

  document.querySelector("#stop-count").addEventListener("click", () => {
    clearInterval(count);
    count = undefined;
    document.querySelector("#count-value").textContent = timeInput;
  })

  document.getElementById("enter-btn").addEventListener("click", getTime);*/



  /*document.querySelector("#play-count").addEventListener("click", () => {
    setInterval(() => {
      let minutes = parseInt(temps / 60, 10)
      let secondes = parseInt(temps % 60, 10)
      if (timeInput <= 0) {
        const sound = new Audio("./assets/ring.mp3");
        sound.play();
        console.log("Done");
        clearInterval(count);
        count = undefined;
      } else {
        minutes = minutes < 10 ? "0" + minutes : minutes
        secondes = secondes < 10 ? "0" + secondes : secondes
  
        count.textContent = `${minutes}:${secondes}`
        temps = temps <= 0 ? 0 : temps - 1
      }
    }, 1000);
  })

}
)*/




