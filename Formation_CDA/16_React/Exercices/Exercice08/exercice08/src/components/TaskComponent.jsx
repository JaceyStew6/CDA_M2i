import React, { useState } from 'react';

const TaskComponent = (props) => {

    //Récupération de todos et setTodos en props, préalablement déclarés dans App.js
    const { todos, setTodos } = props;
    //Déclaration de isDone et setIsDone permettant de gérer l'affichage du toggle via un booléen
    const [isDone, setIsDone] = useState({})

    //Fonction de suppression d'une tâche via récupération d'index
    const deleteByIndex = index => {
        setTodos(oldValues => {
            return oldValues.filter((_, i) => i !== index) //on garde tous les éléments qui ne correspondent pas à l'index à supprimer
        })
    }

    //Gestion du toggle permettant l'affichage dynamique du bouton d'état d'avancement de la tâche en fonction d'un index
    const handleToggle = (index) => {
        setIsDone({
            ...isDone,
            [index]: !isDone[index],
        });
    };

    return (
        <div class='card bg-dark text-white' style={{width: 50 + 'rem', gap: 1 + 'rem'}}>
            <h2>Todos</h2>
            <hr />
            <div>
                {/* On récupère les données (todo) et un index depuis le tableau de todos */}
                {todos.map((todo, index) =>
                    <div key={index} class='card bg-dark text-white border-white position-relative' style={{height: 15 + 'rem', margin: 0.5 + 'rem'}}>
                        <p class="position-absolute top-0 start-0" style={{margin: 0.5 + 'rem'}}>{todo.title}</p>
                        <p class="position-absolute top-0 end-0" style={{margin: 0.5 + 'rem'}}>{todo.dueDate}</p>
                        <p class="position-absolute top-50 start-50 translate-middle-y">{todo.description}</p>
                        {/* on gère le toggle en appelant la fonction handleToggle au clic et on définit son état via une ternaire */}
                        <button onClick={() => handleToggle(index)} type="button" class={isDone[index]? "btn btn-success position-absolute bottom-0 start-0" : "btn btn-warning position-absolute bottom-0 start-0"} style={{width: 5 + 'rem', margin: 0.5 + 'rem'}}>{isDone[index] ? "Done" : "To Do"}</button>
                        <button onClick={() => deleteByIndex(index)} type="button" class="btn btn-danger position-absolute bottom-0 end-0" style={{width: 5 + 'rem', margin: 0.5 + 'rem'}}>Delete</button>
                    </div>)}
            </div>
        </div>
    );
}

export default TaskComponent;