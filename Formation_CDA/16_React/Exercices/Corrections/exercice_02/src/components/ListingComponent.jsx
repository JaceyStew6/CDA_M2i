import React from 'react';
import { useState } from 'react';

const ListingComponent = () => {
  // let listing = ["Toto", "Tata", "Titi"]
  const [listing, setListing] = useState(["Toto", "Tata", "Titi"])

  const addElementToListing = () => {
    // listing.push("Toto")
    // console.log(listing);
    setListing([...listing, "Toto"])
  }

  return ( 
    <div>
        <button onClick={addElementToListing}>Add name</button>
        <ul>
            {
              listing.map((prenom, index) => (
                <li key={index}>{prenom}</li>
              ))
            }
        </ul>
    </div>
   );
}
 
export default ListingComponent;