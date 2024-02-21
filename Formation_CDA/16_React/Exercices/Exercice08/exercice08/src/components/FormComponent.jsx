import React, { useRef } from 'react';

const FormComponent = (props) => {

    //Récupération de la fonction depuis App.js
    const { getValuesFromInputs } = props

    //Déclaration des variables à récupérer dans les inputs
    const titleRef = useRef("")
    const descriptionRef = useRef("")
    const dueDateRef = useRef()

    //Fonction d'ajout d'une tâche dans la to do avec récupération des variables précédentes, stockées dans un objet
    function addTaskToDo() {
        let todoTask = { title: titleRef.current.value, description: descriptionRef.current.value, dueDate: dueDateRef.current.value } //on utilise la syntaxe .current.value pour récupérer la valeur d'une variable avec useRef
        getValuesFromInputs(todoTask) //prend en paramètre l'objet todoTask qui permet de stocker les variables dans le tableau todos déclaré dans App.js
    }


    return (
        <>
            <div class='card bg-dark text-white' style={{ width: 20 + 'rem', height: 30 + 'rem', padding: 0.5 + 'rem' }} >
                <h2>TodoForm</h2>
                <hr />
                    {/* input title */}
                    <label htmlFor="title">Title</label>
                    <input type="text" name="title" id="title" ref={titleRef} style={{ borderRadius: 10, marginBottom: 0.5 + 'rem', height: 2 + 'rem' }} />
                    {/* input description */}
                    <label htmlFor="description">Description</label>
                    <input type="textarea" name="description" id="description" ref={descriptionRef} style={{ height: 15 + 'rem', borderRadius: 10, marginBottom: 0.5 + 'rem' }} />
                    {/* input dueDate */}
                    <label htmlFor="duedate">DueDate</label>
                    <input type="date" name="duedate" id="duedate" ref={dueDateRef} style={{ borderRadius: 10, marginBottom: 1 + 'rem', height: 2 + 'rem' }} />
                    {/* bouton d'ajout de tâche dans la to do */}
                    <button onClick={addTaskToDo} type="button" class="btn btn-dark border-white" style={{ width: 5 + 'rem' }}>Submit</button>
            </div>
        </>
    );
}

export default FormComponent;