import React from 'react';

const ListComponent = () => {

    const personArray = [
        { name: "Black", firstname: "Max" },
        { name: "Channing", firstname: "Caroline" },
    ]

    return (
        <div>
            <table class="table table-striped table-dark">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Nom</th>
                        <th>Prenom</th>
                    </tr>
                </thead>
                <tbody>
                    {personArray.map((data, index) => <tr key={index}>
                    <td>{index}</td>
                        <td>{data.name}</td>
                        <td>{data.firstname}</td>
                    </tr>)}

                </tbody>
            </table>
        </div>
    );
}
export default ListComponent;