import './App.css';
import FormComponent from './components/FormComponent';
import { useState } from 'react';
import TaskComponent from './components/TaskComponent';
import 'bootstrap/dist/css/bootstrap.min.css';
// import 'bootstrap/dist/js/bootstrap.min.js';

function App() {

  //On déclare un tableau todos et un setTodos via un useState()
  const [todos, setTodos] = useState([])

  //On met à jour le tableau de todos qui prend en paramètre une nouvelle tâche (taskTodo)
  const getValuesFromInputs = (taskTodo) => {
    setTodos([...todos, taskTodo])
  };

  return (
    <div className="App">
      {/* On exporte nos variables et fonctions pour les récupérer en tant que props dans les éléments enfants. On détermine que la valeur de getValuesFromInputs sera la valeur de la props du même nom. Idem pour todos et setTodos */}
      <FormComponent getValuesFromInputs={getValuesFromInputs}/>
      <TaskComponent todos={todos} setTodos={setTodos}/>
    </div>
  );
}

export default App;
