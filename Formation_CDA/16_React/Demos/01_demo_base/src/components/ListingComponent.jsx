import React from 'react';

const ListingComponent = () => {

    const maListe = ["Sophie", "Max", "Caroline"]

    return (
        <div>
            <h1>Listing Component</h1>
            <hr />
            <ul>
                {maListe.map((prenom, index) => <li key={index}>{prenom}</li>)} {/*pour chaque élément qu'on va trouver et stocker dans la variable prenom et son index, et on va l'afficher dans la balise li */}
            </ul>
        </div>
    );
}

export default ListingComponent;