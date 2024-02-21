import logo from './logo.svg';
import './App.css';
import FormComponent from './components/FormComponent';
import { useState } from 'react';
import TaskComponent from './components/TaskComponent';
import 'bootstrap/dist/css/bootstrap.min.css';
// import 'bootstrap/dist/js/bootstrap.min.js';

function App() {

  const [todos, setTodos] = useState([])

  const getValuesFromInputs = (taskTodo) => {
    setTodos([...todos, taskTodo])
  };

  return (
    <div className="App">
      <FormComponent getValuesFromInputs={getValuesFromInputs}/>
      <TaskComponent todos={todos} setTodos={setTodos}/>
    </div>
  );
}

export default App;
