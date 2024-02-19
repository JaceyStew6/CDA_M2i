import React from 'react';
import classes from "./FirstComponent.module.css"
import logoPolarFox from "../assets/images/20231219_101802_0000.png"
import TableRow from './TableRow';

const FirstComponent = () => {

    let nom = "Jacey"

    const maFonction = () => {
        return "Bonjour " + nom
    }

    return (
        <div>
            <h1 className={classes.paragrapheRouge}>Mon premier composant</h1>
            <p>{maFonction()}</p>
            <img src={logoPolarFox} alt="logoPolarFox" />
            <table>
                <thead>
                    <tr>
                        <th>ColA</th>
                        <th>ColB</th>
                        <th>ColC</th>
                    </tr>
                </thead>
                <tbody>
                    <TableRow/>
                    <TableRow/>
                    <TableRow/>
                </tbody>
            </table>
        </div>
    );
}

export default FirstComponent;