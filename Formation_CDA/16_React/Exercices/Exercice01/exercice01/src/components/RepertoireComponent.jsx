import React from 'react';

const RepertoireComponent = () => {

    const personArray = [
        { id: 1, name: "Black", firstname: "Max" },
        { id: 2, name: "Channing", firstname: "Caroline" },
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
                        <td>{data.id}</td>
                        <td>{data.name}</td>
                        <td>{data.firstname}</td>
                    </tr>)}

                </tbody>
            </table>
        </div>
    );
}

export default RepertoireComponent;