import React, { useRef } from 'react';

const FormComponent = (props) => {

    const { getValuesFromInputs } = props

    const titleRef = useRef("")
    const descriptionRef = useRef("")
    const dueDateRef = useRef()


    function addTaskToDo() {
        let todoTask = { title: titleRef.current.value, description: descriptionRef.current.value, dueDate: dueDateRef.current.value }
        getValuesFromInputs(todoTask)
    }


    return (
        <>
            <div class='card bg-dark text-white' style={{ width: 20 + 'rem', height: 30 + 'rem', padding: 0.5 + 'rem' }} >
                <h2>TodoForm</h2>
                <hr />
                    <label htmlFor="title">Title</label>
                    <input type="text" name="title" id="title" ref={titleRef} style={{ borderRadius: 10, marginBottom: 0.5 + 'rem', height: 2 + 'rem' }} />
                    <label htmlFor="description">Description</label>
                    <input type="textarea" name="description" id="description" ref={descriptionRef} style={{ height: 15 + 'rem', borderRadius: 10, marginBottom: 0.5 + 'rem' }} />
                    <label htmlFor="duedate">DueDate</label>
                    <input type="date" name="duedate" id="duedate" ref={dueDateRef} style={{ borderRadius: 10, marginBottom: 1 + 'rem', height: 2 + 'rem' }} />
                    <button onClick={addTaskToDo} type="button" class="btn btn-dark border-white" style={{ width: 5 + 'rem' }}>Submit</button>
            </div>
        </>
    );
}

export default FormComponent;