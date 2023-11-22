function quelleHeure (heure = "12h00"){
    alert(`il est ${heure}`);
    //return;  // On ne retourne rien mais le return est implicite même si on ne l'indique pas. Il est alors undefined.
}

quelleHeure();
quelleHeure("14h00");