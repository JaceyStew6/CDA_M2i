import React from 'react';
import classes from "./FirstComponent.module.css"
import logoM2i from "../../assets/images/logo_m2iformation.webp"
import TableRow from '../TableRow';

const FirstComponent = () => {
  let nom = "Tata"

  const maFonction = () => {
    return "Bonjour " + nom
  }

  return ( 
    <div>
      <h1 className={classes.paragrapheRouge}>Mon premier composant</h1>
      <p>{maFonction()}</p>
      <img src={logoM2i} alt="logoM2i" />
      <table>
        <thead>
          <tr>
            <th>ColA</th>
            <th>ColB</th>
            <th>ColC</th>
          </tr>
        </thead>
        <tbody>
          <TableRow />
          <TableRow />
          <TableRow />
        </tbody>
      </table>
    </div>
   );
}
 
export default FirstComponent;